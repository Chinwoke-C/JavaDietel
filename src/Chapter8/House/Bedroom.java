package Chapter8.House;

public class Bedroom {

    private  Bed theBed;
    private Wardrobe theWardrobe;
    private TelevisionSet  tv;

    public Bedroom(Bed theBed, Wardrobe theWardrobe, TelevisionSet tv) {
        this.theBed = theBed;
        this.theWardrobe = theWardrobe;
        this.tv = tv;
    }
    public void enterBedroom(){
        theBed.sleep();
        theWardrobe.changeClothes();
        tv.watchTv();
    }
}
