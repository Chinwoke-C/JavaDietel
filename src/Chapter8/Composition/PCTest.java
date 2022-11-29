package Chapter8.Composition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PCTest {
    @Test
    public void Testpc(){
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("2208", "Dell", "240"
        ,dimensions);
        Monitor theMonitor = new Monitor("27inch Beast", "Apple"
        ,27, new Resolution(2540,1220));

        MotherBoard theMotherboard = new MotherBoard("BJ-200", "Asus",
                4,6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();
    }

}