package ru.stqa.pft.sandbox;

public class Rectangle {

  public double ax; //классы
  public double bx; //классы

  public Rectangle(double ax, double bx){
    this.ax = ax;
    this.bx = bx;
  }

  public double area(){ //обращаемся к классу прямоугольник Р
    return this.ax * this.bx; //площадь прямоугольника Р будет вычислятся по формуле где используются аттрибуты ах бх
  }


}
