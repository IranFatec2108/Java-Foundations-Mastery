package oop.entities;

public class Rectangle {
    public double width;
    public double height;

    public double area() {

        return width * height;
    }
    public double perimeter() {

        return (height + width) * 2.0;
    }
    public double diagonal() {

        return Math.sqrt((height * height) + (width * width));
    }

}
