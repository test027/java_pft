package ru.stqa.pft.sandbox;

public class Square {

  public double l; //классы

  public Square(double l){
    this.l = l; //thisl - аттрибут ( & это тот обьект, который инициализируется в конструкторе), l = переменная аргумент функции
  } //добавляем конструктор Квадрат, он должен иметь такое же имя, как класс
  // но не имеет возвращаемых значений, но точно также как функция - может принимать параметры

  public double area() {
    return  this.l * this.l;
  }


}
