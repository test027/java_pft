package ru.stqa.pft.sandbox;

public class Triangle { //новый класс Треугольник

  double at;
  double bt; //внутри него 2 класса

  public Triangle(double at, double bt){
    this.at = at;
    this.bt = bt;
  }

  public  double area(){ //обращается к классу треугольник
    return this.at * this.bt * 0.5;
  }


}
