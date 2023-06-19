// 11. Design a java program to show dynamic polymorphism.
class MyArea {
    void area() {
        System.out.println("A concrete function called Area()");
    }
}

class SqArea extends MyArea {
    double side;
    SqArea(double s) {
        side = s;
    }
    void area() { 
        double area;
        area=side*side;
        System.out.println("Area of Square = " + area);
    }
}

class RectArea extends MyArea {
    double l,b;
    RectArea(double l, double b) {
        this.l = l;
        this.b = b;
    }
    void area() { 
        double area;
        area=l*b;
        System.out.println("Area of Rectangle = " + area);
    }
}

class Main {
    public static void main(String a[]) {
        MyArea ma; 
        ma=new SqArea(10); 
        ma.area(); 
        ma=new RectArea(10, 2); 
        ma.area(); 
    }
}
