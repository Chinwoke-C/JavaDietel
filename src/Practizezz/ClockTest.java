package Practizezz;


class ClockTest {
    public static void main(String[] args) {
        Clock myClock = new Clock(23, 59, 59);
        myClock.setHour(1);
        myClock.setMinute(1);
        myClock.setSecond(3);

        displayDetails(myClock);

    }

    private static void displayDetails(Clock myClock) {
        System.out.print("Your motherfucking time is: ");
        System.out.printf("%02d:",myClock.getHour());
        System.out.printf("%02d:", myClock.getMinute());
        System.out.printf("%02d",myClock.getSecond());
    }
}