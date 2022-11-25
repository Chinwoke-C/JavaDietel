package ObjectOriented;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(25);
        System.out.printf("The area of the circle of radius %f is: %f%n ",circle1.radius, circle1.getArea());
    }

}
