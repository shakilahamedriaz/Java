// Base class
class Shape {
    public void area() {
        System.out.println("Display area");
    }
}

// Child class
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println("Triangle area: " + (0.5 * l * h));
    }
}

// Derived class from Triangle
class EquilateralTriangle extends Triangle {
    public void area(int s) {
        System.out.println("Equilateral triangle area: " + (Math.sqrt(3) / 4 * s * s));
    }
}

public class bInhe {
    public static void main(String[] args) {
        EquilateralTriangle et = new EquilateralTriangle();
        et.area(4);  // Pass side length as parameter

        Triangle t = new Triangle();
        t.area(3, 5);   // Pass base length and height as parameters
    }
}
