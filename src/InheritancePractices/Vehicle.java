package InheritancePractices;

public class Vehicle {
    private int steeringMechanism;
    private int engine;
    private  int gears;
    private int seats;
    private int accelerator;
    private int brake;
    private int headlamps;
    private int wheels;

    public Vehicle(int steeringMechanism, int engine, int gears, int seats, int accelerator, int brake, int headlamps, int wheels){
        this.steeringMechanism = steeringMechanism;
        this.engine = engine;
        this.gears = gears;
        this.seats = seats;
        this.accelerator = accelerator;
        this.brake = brake;
        this.headlamps = headlamps;
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public int getEngine() {
        return engine;
    }

    public int getGears() {
        return gears;
    }

    public int getSeats() {
        return seats;
    }

    public int getAccelerator() {
        return accelerator;
    }

    public int getBrake() {
        return brake;
    }
    public int getSteeringMechanism(){
        return steeringMechanism;
    }
    public void accelerate(int speed){
        System.out.println("Vehicle.accelerate(), speed has increased");
    }
    public void steer(boolean steerLeftOrRight){
        System.out.println("Vehicle.steer(), Vehicle can steer left or right");
    }
}
