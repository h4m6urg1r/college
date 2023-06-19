/*
PRACTICAL 10
AIM : 
Design a java program to create an abstract class named Shape, that contains an empty method called numberOfSides(). Provide four classes named Trapezoid, Triangle, Rectangle and Hexagon such that each one of the classes contains only the method numberOfSides(), that contains number of sides in each geometrical figure.
 Code : 
*/
/*
abstract class Area {
    abstract void area();
}

class SqArea extends Area {
    double s;
    void area() {
        double areasq;
        s = 10.0;
        areasq = s * s;
        System.out.println("Area of Square " + areasq);
    }
}

class RectArea extends Area {
    double l, b;
    void area() {
        double arearect;
        l = 10.0;
        b = 2.0;
        arearect = l * b;
        System.out.println("Area of Rectangle " + arearect);
    }
}

class Main {
    public static void main(String a[]) {
        // MyArea ma= new MyArea();
        // ma.area();
        Area sq = new SqArea();
        sq.area();
        Area rect = new RectArea();
        rect.area();
    }
}
*/
abstract class Shape {
    abstract int numberOfSides();
}

class Trapezoid extends Shape {
    int numberOfSides() {
        return 4;
    }
}

class Triangle extends Shape {
    int numberOfSides() {
        return 3;
    }
}

class Rectangle extends Shape {
    int numberOfSides() {
        return 4;
    }
}

class Hexagon extends Shape {
    int numberOfSides() {
        return 6;
    }
}

class Main {
    public static void main(String[] args) {
        Shape trapezoid = new Trapezoid();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape hexagon = new Hexagon();

        System.out.println("Number of sides in a Trapezoid: " + trapezoid.numberOfSides());
        System.out.println("Number of sides in a Triangle: " + triangle.numberOfSides());
        System.out.println("Number of sides in a Rectangle: " + rectangle.numberOfSides());
        System.out.println("Number of sides in a Hexagon: " + hexagon.numberOfSides());
    }
}
