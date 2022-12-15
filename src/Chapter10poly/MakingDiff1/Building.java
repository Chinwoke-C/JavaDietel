package Chapter10poly.MakingDiff1;

public class Building implements CarbonFootprint {
    private int size;
    private int powerUsage;
    private String fuelType;
    private int fuelPerLiter;
    private String gasType;
    private int gasPerKg;


    public Building(int size, int powerUsage, String fuelType,
            int fuelPerLiter, String gasType, int gasPerKg) {
        this.size = size;
        this.powerUsage = powerUsage;
        this.fuelType = fuelType;
        this.fuelPerLiter = fuelPerLiter;
        this.gasType = gasType;
        this.gasPerKg = gasPerKg;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPowerUsage() {
        return powerUsage;
    }

    public void setPowerUsage(int powerUsage) {
        this.powerUsage = powerUsage;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getFuelPerLiter() {
        return fuelPerLiter;
    }

    public void setFuelPerLiter(int fuelPerLiter) {
        this.fuelPerLiter = fuelPerLiter;
    }

    public String getGasType() {
        return gasType;
    }

    public void setGasType(String gasType) {
        this.gasType = gasType;
    }

    public int getGasPerKg() {
        return gasPerKg;
    }

    public void setGasPerKg(int gasPerKg) {
        this.gasPerKg = gasPerKg;
    }

    @Override
    public double getCarbonFootprint() {
        double electricityFactor = getPowerUsage() * 0.85;
        double fuelFactor = getFuelPerLiter() * 2.296;
        double gasFactor = getGasPerKg() * 2.983;
        double carbonEmission = electricityFactor + fuelFactor + gasFactor;
        double carbonFootPrint = carbonEmission / 1000;

        return carbonFootPrint;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Building{");
        sb.append("size=").append(size);
        sb.append(", powerUsage=").append(powerUsage);
        sb.append(", fuelType='").append(fuelType).append('\'');
        sb.append(", fuelPerLiter=").append(fuelPerLiter);
        sb.append(", gasType='").append(gasType).append('\'');
        sb.append(", gasPerKg=").append(gasPerKg);
        sb.append('}');
        return sb.toString();
    }
}
