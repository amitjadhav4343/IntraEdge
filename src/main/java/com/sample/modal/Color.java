package com.sample.modal;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Color {

  private String colorName;

  private String colorRGBCode;

  public Color(String colorName, String colorRGBCode) {
    super();
    this.colorName = colorName;
    this.colorRGBCode = colorRGBCode;
  }
}
