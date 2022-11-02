package PracticingLoops;

public class MultiplicationTable {
    public static void main(String[] args) {
       printOutDigits();
       printOutLine();
       printTable();

    }
    private static void printOutDigits(){
        System.out.println("                The multiplication table");

        System.out.print("    ");
        for (int i = 1; i <= 12; i++) {
            System.out.print("   " + i);
        }
    }
    private static void printOutLine(){
        System.out.println("\n-----------------------------------------------------");

    }
    private static void printTable(){
        for (int j = 1; j <= 12; j++) {
            System.out.print(j + " | ");

            for (int k = 1; k <= 12; k++) {
                System.out.printf("%4d", j * k);
            }
            System.out.println();

        }
    }
}
