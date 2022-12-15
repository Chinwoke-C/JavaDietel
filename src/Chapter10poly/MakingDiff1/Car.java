package Chapter10poly.MakingDiff1;
// todo (CarbonFootprint Interface: Polymorphism) Using interfaces, as you learned in this chapter,
//        you can specify similar behaviors for possibly disparate classes. Governments and companies
//        worldwide are becoming increasingly concerned with carbon footprints (annual releases of carbon
//        dioxide into the atmosphere) from buildings burning various types of fuels for heat, vehicles burning
//        fuels for power, and the like. Many scientists blame these greenhouse gases for the phenomenon
//        called global warming. Create three small classes unrelated by inheritance—classes Building, Car
//        and Bicycle.
//        Give each class some unique appropriate attributes and behaviors that it does not have
//        in common with other classes.
//        Write an interface CarbonFootprint with a getCarbonFootprint
//        method. Have each of your classes implement that interface, so that its getCarbonFootprint method
//        calculates an appropriate carbon footprint for that class (check out a few websites that explain how
//        to calculate carbon footprints). Write an application that creates objects of each of the three classes,
//        places references to those objects in ArrayList<CarbonFootprint>, then iterates through the Array-
//        List, polymorphically invoking each object’s getCarbonFootprint method. For each object, print
//        some identifying information and the object’s carbon footprint.
public class Car implements CarbonFootprint {
    private int size;
    private int fuelPerLiter;

    public Car(int size, int fuelPerLiter) {
        this.size = size;
        this.fuelPerLiter = fuelPerLiter;

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getFuelPerLiter() {
        return fuelPerLiter;
    }

    public void setFuelPerLiter(int fuelPerLiter) {
        this.fuelPerLiter = fuelPerLiter;
    }

    @Override
    public double getCarbonFootprint() {
        double fuelFactor = getFuelPerLiter() * 2.296;
        double carbonEmission = fuelFactor;

        return carbonEmission / 1000;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Car{");
        sb.append("size=").append(size);
        sb.append(", fuelPerLiter=").append(fuelPerLiter);
        sb.append('}');
        return sb.toString();
    }
}
