package ru.stqa.pft.sandbox;

public class Task2 {

  public static void main(String[] args) {

    Point first = new Point(2, -5); //создаем точку 1
    Point second = new Point(-4, 3); //создаем точку 2

    System.out.println("Расстояние между точкой P1 с координатами х: " + first.x + " и у: " + first.y +
            " и точкой P2 с координатами х: " + second.x + " и у: " + second.y + " = " + distance(first, second));

  }


  public static double distance(Point p1, Point p2) {
    return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
  }


  }
