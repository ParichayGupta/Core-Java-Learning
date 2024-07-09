package Inhertance;

public class Example5 {
    public static void main(String[] args) {
        Circle c = (Circle) new Shape();
        c.display("Hello", "World");
    }
}


 class Shape {
    protected void display() {
        System.out.println("Display-base");
    }

     void display(String x, Object y){
         System.out.println("first method from shape");
     }


}
// Circle.java
class Circle extends Shape {
    protected void display() {
        System.out.println("Display-derived");
    }

    void display(String x, Object y){
        System.out.println("first method");
    }
}
