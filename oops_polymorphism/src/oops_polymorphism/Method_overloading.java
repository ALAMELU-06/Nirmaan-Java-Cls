package oops_polymorphism;

public class Method_overloading {

  
    int area(int side) {
        return side * side;
    }

    
    int area(int length, int breadth) {
        return length * breadth;
    }

    
    double area(double radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {

        Method_overloading obj = new Method_overloading();

        System.out.println("Square Area: " + obj.area(5));
        System.out.println("Rectangle Area: " + obj.area(10, 5));
        System.out.println("Circle Area: " + obj.area(5.0));
    }
}