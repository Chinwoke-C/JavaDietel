package Chapter8.Exercise;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(4, 5);
        System.out.printf("volume of cylinder of radius: %d and height: %d is: %.2f",
                c1.getRadius(),c1.getHeight(),c1.calculateVolume());
    }
}
