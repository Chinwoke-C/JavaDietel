package myPractices;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public  static  final double METERS_PER_INCH = 0.0254;

    public BMI(String name, int age, double weight,double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public  double getBMI() {
        double bmi = weight * KILOGRAMS_PER_POUND / ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
        return Math.round(bmi * 100) / 100.0;
    }
        public String validateStatus(){

      validateUnderweight();
         validateNormalWeight();
         validateOverweight();

            return "Obese";
        }
        public void validateUnderweight(){
            double bmi = getBMI();
            boolean underweight = bmi < 18.5;
            if (underweight) throw  new IllegalStateException("You are underweight eat more");
        }
        public void validateNormalWeight(){
            boolean normal = getBMI() < 25;
            if (normal) {
                System.out.println("Your weight is normal keep it up");
            }
    }
    public void validateOverweight(){
        boolean overWeight = getBMI() < 30;
        if ( overWeight) throw new IllegalStateException("Your are getting to fat");

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}


