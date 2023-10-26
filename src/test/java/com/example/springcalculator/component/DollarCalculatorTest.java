package com.example.springcalculator.component;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import({MarketApi.class, DollarCalculator.class})
public class DollarCalculatorTest {

  @MockBean
  private MarketApi marketApi;

  @Autowired
  private DollarCalculator dollarCalculator;

  @Test
  public void dollarCalculatorTest() {
    // given
    Mockito.when(marketApi.connect()).thenReturn(3000);

    // when
    dollarCalculator.init();
    int sum = this.dollarCalculator.sum(10,10);
    int minus = this.dollarCalculator.minus(10, 5);

    // then
    Assertions.assertEquals(60000, sum);
    Assertions.assertEquals(15000, minus);
  }
}
