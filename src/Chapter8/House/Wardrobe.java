package Chapter8.House;

public class Wardrobe {
    private int size;
    private int height;
    private int width;
    private String type;

    public Wardrobe(int size, int height, int width, String type) {
        this.size = size;
        this.height = height;
        this.width = width;
        this.type = type;
    }
    public void changeClothes(){
        System.out.println("I am changing into my Pyjamas");
    }

    public int getSize() {
        return size;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getType() {
        return type;
    }
}
