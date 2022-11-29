package Chapter8.House;

public class Bed {
    private int Size;
    private int width;
    private String maker;

    public Bed(int size, int width, String make) {
        Size = size;
        this.width = width;
        this.maker = make;
    }
    public  void sleep(){
        System.out.println("I am sleeping");
    }

    public int getSize() {
        return Size;
    }

    public int getWidth() {
        return width;
    }

    public String getMake() {
        return maker;
    }
}
