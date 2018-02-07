package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Jane");

    Square s = new Square(5); //создаем обьект квадрат + (устанавливаем значение атрибута)
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(3,4); //создаем обьект прямоугольник
    System.out.println("Площадь прямоугольника со сторонами " + r.ax + " и " + r.bx + " = " + r.area()); //Площадь у
    // прямоугольника Р со сторонами р.ах и р.бх равна + вычисляем площадь по формуле для прямоугольника Р.

    Rectangle rx = new Rectangle(5, 6); //создаем обьект прямоугольник
    System.out.println("Площадь прямоугольника со сторонами " + rx.ax + " и " + rx.bx + " = " + rx.area()); //Площадь у
    // прямоугольника Р со сторонами р.ах и р.бх равна + вычисляем площадь по формуле для прямоугольника Р.

    Triangle w = new Triangle(3, 4); //создаем треугольник
    System.out.println("Площадь треугольника со стороной " + w.bt + " и высотой " + w.at + " = " + w.area());

    }


  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

}