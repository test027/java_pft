package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Jane");

    double l = 5;
    System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

    double ax = 3;
    double bx = 4;
    System.out.println("Площадь прямоугольника со сторонами " + ax + " и " + bx + " = " + area(ax, bx));

  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  public static double area(double len) {
    return len * len;
  }

  public static double area(double a, double b){
    return a * b;
  }

}