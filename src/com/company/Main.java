package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle(2,5);
        Rectangle obj2 = new Rectangle(4,5);
        Rectangle obj3 = new Rectangle(4);

        System.out.println("Площадь = " +" " + obj1.calculateArea());
        obj1. printArea();
        obj1.printRectangleKind();


        System.out.println("Площадь  = :" +" " + obj2.calculateArea());
        obj2. printArea();
        obj2.printRectangleKind();
        System.out.println("Результат сравнения " + "" + obj2.isTheSameRectangle(obj1));

        System.out.println("Площадь  = :" +" " + obj3.calculateArea());
        obj3. printArea();
        obj3.printRectangleKind();
        System.out.println("Результат сравнения " + "" + obj3.isTheSameRectangle(obj2));

	// write your code here
    }
}
