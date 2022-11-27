package Chapter8.Exercise;

public class Cylinder {
    private int radius = 1;
    private int height = 1;

public Cylinder(int radius, int height){
    this.radius = radius;
    this.height = height;

}
    public double calculateVolume(){


        return (Math.PI * radius * radius * height);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        boolean isInvalid = radius < 0;
        if (isInvalid) throw new IllegalArgumentException("radius must be positive numbers");
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        boolean isInvalid = height < 0;
        if (isInvalid) throw new IllegalArgumentException("height must be positive");
        this.height = height;
    }
}
