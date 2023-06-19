/*
Practical 2

AIM :
Design a java program to define a class, describe its constructor, over-load the constructor and instantiate the object. 
Code :
*/
class Shapes {
    double len;
    double bre;
    double result;

    Shapes() {
        len = 0.0;
        bre = 0.0;
    }

    Shapes(double l) {
        len = l;
        bre = 0.0;
    }

    Shapes(double l, double b) {
        len = l;
        bre = b;
    }

    void area() {
        if (len != 0.0 && bre == 0.0) {
            result = len * len;
            System.out.println("Area of square = " + result);
        }
        if (len != 0.0 && bre != 0.0) {
            result = len * bre;
            System.out.println("Area of rectangle = " + result);
        }
        else if (len == 0.0 && bre == 0.0) {
            System.out.println("No output");
        }
    }
}

class Main {
    public static void main (String a[]) {
        double para1, para2;
        para1 = 10.0;
        para2 = 20.0;

        Shapes s1 = new Shapes();
        Shapes s2 = new Shapes(para1);
        Shapes s3 = new Shapes(para1, para2);
        s2.area();
        s3.area();
        s1.area();
    }
}
