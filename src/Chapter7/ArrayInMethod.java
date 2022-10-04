package Chapter7;

public class ArrayInMethod {

    public int addNumbers(int[] numbers){
    int total = 0;
        for (int i = 0; i <numbers.length ; i++) {
            total += numbers[i];

        }
            return total;
    }
}
