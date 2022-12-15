package Chapter10poly.MakingDiff1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CarbonFootprint> emissions = new ArrayList<>();

        emissions.add(new Bicycle("food", 720));
        emissions.add(new Building(4, 145, "gas",
                70, "cooking gas", 650));
        emissions.add(new Car(4,600));



        for (CarbonFootprint emission: emissions) {
            System.out.printf("The carbon footprint for %s is %f%n",emission, emission.getCarbonFootprint());
            //System.out.println(emission);

        }


    }
}
