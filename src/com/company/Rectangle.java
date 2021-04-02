package com.company;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class Rectangle {
    protected double x;
    protected double y;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle(double x) {
        this.x = x;
        this.y = x;
    }

    public double calculateArea() {
        return this.x*this.y;

    }


    public void printArea() {
        System.out.println("Площадь " + setRectangleKind() + " " + calculateArea());
    }

    public void printRectangleKind() {
        if (this.x == this.y) {
            System.out.println("Это квадрат");
        } else {
            System.out.println("Это прямоугольник");
        }
    }

    public String setRectangleKind() {
        if (this.x == this.y) {
            return "квадратa";
        } else {
            return "прямоугольникa";
        }
    }

    public boolean isTheSameRectangle(@NotNull Rectangle R2) {
        if (R2.x==this.x & R2.y==this.y ) {
            return true;
        } else {
            return false;

        }
    }

}
