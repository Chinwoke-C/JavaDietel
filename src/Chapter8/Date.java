package Chapter8;

public class Date {
    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth =
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public  Date(int month, int day, int year){
        validateDate(day,month,year);
        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("Date object constructor for date %s%n", this);
    }

    public void validateMonth(int day, int month) {
       boolean monthIsInvalid = day <= 0 || month > 12;
       if (monthIsInvalid) throw new IllegalArgumentException("month must be between 1 - 12");
    }

    public void validateDay(int day, int month) {
        boolean dayIsInvalid = day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29));
        if (dayIsInvalid) throw new IllegalArgumentException("day(" + day + ") out -of-range for the specified month and year");
    }

    public void validateLeapYear(int year) {
        boolean leapYearIsInvalid = month == 2 && day == 29 && !(year % 400 == 0 ||(year % 4 == 0 && year % 100 != 0));
        if (leapYearIsInvalid) throw new IllegalArgumentException("Leap year not valid");
    }
    public void validateDate(int day, int month, int year){
        validateDay(day, month);
        validateMonth(day, month);
        validateLeapYear(year);
    }
    public String  toString(){

        return String.format("%d/%d/%d", month, day, year);
    }

}
