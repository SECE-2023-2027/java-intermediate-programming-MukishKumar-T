package AreaCalculation;

class AreaCalculator {
    static double calculateArea(double radius){
        return Math.PI * radius * radius;
    }

    static double calculateArea(double length, double breadth){
        return length * breadth;
    }

    static double calculateArea(int side){
        return side * side;
    }
}
