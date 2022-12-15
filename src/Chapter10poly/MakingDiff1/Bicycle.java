package Chapter10poly.MakingDiff1;

public class Bicycle implements CarbonFootprint {
    private String fuelType;
    private int fuelUsed;

    public Bicycle(String fuelType, int fuelUsed) {
        this.fuelType = fuelType;
        this.fuelUsed = fuelUsed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getFuelUsed() {
        return fuelUsed;
    }

    public void setFuelUsed(int fuelUsed) {
        this.fuelUsed = fuelUsed;
    }

    @Override
    public double getCarbonFootprint() {
        int carbonFootPrint = getFuelUsed() / 1000;

        return carbonFootPrint;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Bicycle{");
        sb.append("fuelType='").append(fuelType).append('\'');
        sb.append(", fuelUsed=").append(fuelUsed);
        sb.append('}');
        return sb.toString();
    }
}
