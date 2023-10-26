package com.example.springcalculator.component;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DollarCalculator implements ICalculator {

  private int price = 1;

  private final MarketApi market;

  // 달러의 환율에 맞게 계산을 해주고 싶다
  // 하여 calculator를 사용하기 전에 init()를 해서 시장에서 달러 환율 값을 가져와서 price에 넣는 작업을 하자.
  @Override
  public void init() {
    this.price = market.connect();
  }

  // 시장에 연결해서 달러의 환율 값을 받아온다.
  // 하지만 계산기에 시장에 연결해서 값을 받아오는 것은 많은 책임을 갖는다.
  // 하여 Market Api 클래스를 새로 만들어서 Market에서 connet를 하고 계산기는 그 값을 받아서 price에 적용해보자.

  // Market Api 클래스를 만들어서 connet()를 거기에 만들고, DollorCalculator에 MarketApi field를 추가해서
  // DollorCalculator이 생성자로 MarketApi를 파라미터로 넣어주자.
//  public int connect() {
//    return 1100;
//  }

  @Override
  public int sum(int x, int y) {
    x *= price;
    y *= price;
    return x + y;
  }

  @Override
  public int minus(int x, int y) {
    x *= price;
    y *= price;
    return x - y;
  }
}
