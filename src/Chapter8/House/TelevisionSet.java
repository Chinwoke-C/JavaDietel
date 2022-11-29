package Chapter8.House;

import Chapter8.Composition.Resolution;

public class TelevisionSet {
    private int width;
    private int height;
    private Resolution resolution;

    public TelevisionSet(int width, int height, Resolution resolution) {
        this.width = width;
        this.height = height;
        this.resolution = resolution;
    }
    public  void watchTv(){
        System.out.println("i am watching the tv");
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Resolution getResolution() {
        return resolution;
    }
}
