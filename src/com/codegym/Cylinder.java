package com.codegym;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder (){

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return height * Math.pow(getRadius(),2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", Area =" +getArea()+'}'+"\nLớp cha: "+ super.toString();
    }
}
