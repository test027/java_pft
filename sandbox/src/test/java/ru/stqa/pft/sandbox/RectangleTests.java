package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleTests {

  @Test
  public void testArea(){
    Rectangle r = new Rectangle(5, 7);
    Assert.assertEquals(r.area(), 35.0);
  }

}
