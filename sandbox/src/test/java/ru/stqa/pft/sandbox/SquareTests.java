package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {

  @Test
  public void testArea(){
    Square s = new Square(5); //создаем новый квадрат со стороной 5
    Assert.assertEquals(s.area(), 25.0); //вычисляем его площадь и проверяем, что он выполняется правильно
  }

}
