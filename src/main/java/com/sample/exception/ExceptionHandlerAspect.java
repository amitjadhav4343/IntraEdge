package com.sample.exception;

import static org.springframework.core.annotation.AnnotatedElementUtils.findMergedAnnotation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class ExceptionHandlerAspect extends ResponseEntityExceptionHandler {

  @ExceptionHandler(Exception.class)
  public ResponseEntity<String> handleGeneralExceptions(Exception e) {
    log.error("Inside Exception handler aspect -", e);

    HttpStatus status = resolveAnnotatedResponseStatus(e);
    return new ResponseEntity<>("Unable to process your request. Please contact +91-9823378722"
        + e.getMessage() + "-" + e.getClass(), status);
  }

  private HttpStatus resolveAnnotatedResponseStatus(Exception exception) {
    ResponseStatus annotation = findMergedAnnotation(exception.getClass(), ResponseStatus.class);
    if (annotation != null) {
      return annotation.value();
    }
    return HttpStatus.INTERNAL_SERVER_ERROR;
  }
}
