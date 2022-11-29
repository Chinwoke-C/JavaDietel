package Chapter8.House;

import Chapter8.Composition.Resolution;

public class BedroomTest {
    public static void main(String[] args) {
        Bed myBed = new Bed(40,39, "vitaFoam");
        Wardrobe myWardrobe = new Wardrobe(70, 65, 20,"attached");
        TelevisionSet tv = new TelevisionSet(45,22,new Resolution(1080,2340));

        Bedroom myBedroom = new Bedroom(myBed, myWardrobe, tv);
        myBedroom.enterBedroom();
    }
}
