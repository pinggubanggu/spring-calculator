package com.example.springcalculator.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Res {

  private int result;

  private Body response;

  // json에 depth를 만들어보자
  @Data
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Body {
    private String resultCode = "OK";
  }

}
