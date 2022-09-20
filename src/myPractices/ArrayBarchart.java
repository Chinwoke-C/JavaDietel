package myPractices;

public class ArrayBarchart {
    public static void main(String[] args) {
        int[] myArray ={0,0,0,0,0,0,1,2,4,2,1};

        System.out.print("Grade distribution: ");

    for (int counter = 0; counter < myArray.length; counter++){
      if (counter == 10){
          System.out.printf("%5d: ", 100);
      }
      else{
          System.out.printf("%02d - %02d: ",
                  counter * 10, counter * 10 + 9);
      }
      for (int stars = 0; stars < myArray[counter]; stars++){
          System.out.print(" *");
      }
        System.out.println("");
           }
    }
}
