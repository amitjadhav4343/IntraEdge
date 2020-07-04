package com.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sample.service.SampleService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/intraEdge")
public class SampleController {

  @Autowired
  private SampleService sampleService;

  @GetMapping(value = "/colors")
  public ResponseEntity<?> getColors() {
    log.info("getColors :");
    return new ResponseEntity<>(sampleService.getColors(), HttpStatus.OK);
  }


}
