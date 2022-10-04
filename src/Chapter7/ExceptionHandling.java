package Chapter7;

public class ExceptionHandling {
    public static void main(String[] args) {
        int[] miArray = new int[3];
        try {
            miArray[0] = 2;
            miArray[1] = 4;
            miArray[2] = 3;
            miArray[3] = 5;
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | IllegalArgumentException e) {
            System.out.println("You are going out of bounds!!!");

            for (int i = 0; i < miArray.length; i++) {
                System.out.println(miArray[i]);
            }
        }
    }
}
