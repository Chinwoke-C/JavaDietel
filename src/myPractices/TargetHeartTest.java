package myPractices;



import java.util.Scanner;

class TargetHeartTest {
    public static void main(String[] args) {
        TargetHeart myHeart = new TargetHeart("Marcus","Hutchins","February",4, 1996 );
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your firstname: ");
        String firstName = input.nextLine();
        myHeart.setFirstName(firstName);

        System.out.println();

        System.out.print("Enter your lastname: ");
        String lastName = input.nextLine();
        myHeart.setLastName(lastName);

        System.out.println();

        System.out.print("Enter your birthMonth: ");
        String month = input.nextLine();
        myHeart.setMonth(month);

        System.out.println();

        System.out.println("Enter your dayOfBirth: ");
        int day = input.nextInt();
        myHeart.setDay(day);

        System.out.println();

        System.out.print("Enter your yearOfBirth: ");
        int year = input.nextInt();
        myHeart.setYear(year);
        System.out.println();


        DisplayHealth(myHeart);
    }

    private static void DisplayHealth(TargetHeart myHeart) {
        System.out.printf("Patients firstname is: %s", myHeart.getFirstName());
        System.out.println();
        System.out.printf("Patients lastName is: %s",myHeart.getLastName());
        System.out.println();
        System.out.printf("Patients month of birth is: %s", myHeart.getMonth());
        System.out.println();
        System.out.printf("Patient Birth day is: %s", myHeart.getDay());
        System.out.println();
        System.out.printf("Patient is %d years old", myHeart.getAge());
        System.out.println();
        myHeart.getHeartRate();
        System.out.println();
        System.out.printf("Patient maximum heartRate is %d",myHeart.getMaximumHeartRate());

    }


}