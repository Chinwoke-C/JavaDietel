package myPractices;

//(Target-Heart-Rate Calculator) While exercising, you can use a heart-rate monitor to see
//        that your heart rate stays within a safe range suggested by your trainers and doctors. According to
//        the American Heart Association (AHA) (http://bit.ly/TargetHeartRates), the formula for calculating
//        your maximum heart rate in beats per minute is 220 minus your age in years. Your target
//        heart rate is a range that’s 50–85% of your maximum heart rate. [Note: These formulas are estimates
//        provided by the AHA. Maximum and target heart rates may vary based on the health, fitness and
//        gender of the individual. Always consult a physician or qualified health-care professional before
//        beginning or modifying an exercise program.] Create a class called HeartRates. The class attributes
//should include the person’s first name, last name and date of birth (consisting of separate attributes
//        for the month, day and year of birth). Your class should have a constructor that receives this data as
//        parameters. For each attribute provide set and get methods. The class also should include a method
//        that calculates and returns the person’s age (in years), a method that calculates and returns the person’s
//        maximum heart rate and a method that calculates and returns the person’s target heart rate.
//        Write a Java app that prompts for the person’s information, instantiates an object of class Heart-
//        Rates and prints the information from that object—including the person’s first name, last name and
//        date of birth—then calculates and prints the person’s age in (years), maximum heart rate and targetheart-
//        rate range.

import java.lang.annotation.Target;

public class TargetHeart {
    String firstName;
    String lastName;
    String month;
    int day;
    int year;



    public TargetHeart(String firstName, String lastName, String month, int day
            , int year){
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.year = year;

    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setMonth(String month){
        this.month = month;
    }
    public String getMonth(){
        return month;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    } public int getAge(){
        return 2022 - year;
    }
    public int getDay(){
      return day;
    }
    public void setDay(int day){
        this.day = day;
    }

    public int getMaximumHeartRate(){
        return 220 - getAge();

    }
    public void getHeartRate(){
        int Target = 50 * getMaximumHeartRate() /100;
        int Heart = 85 * getMaximumHeartRate() / 100;
        System.out.printf("Patient heart rate is %d and %d bpm", Target, Heart);
    }



}
