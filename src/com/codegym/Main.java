package com.codegym;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(1.0,"Blue");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
    }
}
