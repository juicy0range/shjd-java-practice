package com.rapid7.exam;

/**
 * @program: rapid7-exam-shjd
 * @description:
 * @author: rapid7
 * @create: 2019-11-10 09:39
 **/


abstract class Shape {
    public abstract double area();
}


class Circle extends Shape {
    protected double r;
    protected final static double PI = Math.PI;//可以设置圆周率为其他值，譬如3.14

    public Circle(double r) {
        this.r = r;
    }

    public double area() {
        return PI * r * r;
    }
}

public class II_II_DerivedClass {

    public static void main(String[] args) {
        Shape circle = new Circle(2);
        System.out.println("area ==" + circle.area());
    }
}
