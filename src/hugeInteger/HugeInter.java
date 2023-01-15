package hugeInteger;

import java.util.Arrays;

public class HugeInter {
    private int numberLength;
    static int [] hugeInt = new int[40];
    private int maxSize;

    public  void parse(String number) {
        numberLength = number.length();
        for (int i = 0; i < numberLength ; i++) {
            hugeInt[i] = Character.getNumericValue(number.charAt(i));
//            String character = Character.toString(number.charAt(i));
//            hugeInt[i] = Integer.parseInt(character);
        }

    }

    public static int[] getNewArray() {

        return hugeInt;
    }
    @Override
    public  String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < numberLength; i++){
            stringBuilder.append(hugeInt[i]);

        }
        return stringBuilder.toString();
    }

//    public HugeInter add(String num2) {
//        int carry = 0;
//        HugeInter result = new HugeInter(maxSize);
//    }
}
