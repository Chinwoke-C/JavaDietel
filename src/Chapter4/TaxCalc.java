package Chapter4;
//Tax Cal: Develop a Java application that determines the total tax for each of three
//        citizens. The tax rate is 15% for earnings up to 30,000 USD earned by each citizen and 20% for all
//        earnings in excess of that ceiling. You are given a list with the citizens’ names and their earnings in
//        a given year. Your program should input this information for each citizen,
//        then determine and display the citizen’s total tax. Use class Scanner to input the data.

public class TaxCalc {
 private String name;
 private double income;
 private double tax;
 private int year;
    public TaxCalc(String name,double income, int year){
     this.name = name;
     this.income = income;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setIncome(double income){
        this.income = income;
    }
    public double getIncome(){
        return income;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public void getTax(){
       if (getIncome() > 30000.00){
           tax = 20 * getIncome() / 100;
       } else {
            tax = 15 * getIncome() / 100;
       }
       System.out.printf("The calculated tax is: %f",tax);
    }

}
