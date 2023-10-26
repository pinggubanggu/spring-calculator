package com.example.springcalculator.controller;

import com.example.springcalculator.component.Calculator;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CalculatorApiController {

  private final Calculator calculator;

  @RequestMapping("/sum")
  public int sum(@RequestParam int x, @RequestParam int y) {
    this.calculator.init();
    return this.calculator.sum(x,y);
  }

  @RequestMapping("/minus")
  public int minus(@RequestParam int x, @RequestParam int y) {
    this.calculator.init();
    return this.calculator.minus(x,y);
  }


}
