package AreaCalculator;

public class Main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);
        Shape ellipse = new Ellipse(6, 4);

        System.out.println("Rectangle Area: " + calculator.calculateArea(rectangle));
        System.out.println("Circle Area: " + calculator.calculateArea(circle));
        System.out.println("Ellipse Area: " + calculator.calculateArea(ellipse));
    }
}
