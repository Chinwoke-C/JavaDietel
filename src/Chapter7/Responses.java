package Chapter7;
//Twenty students were asked to rate on a scale of 1 to 5 the quality of the food in the
//        student cafeteria, with 1 being “awful” and 5 being “excellent.” Place the 20 responses
//        in an integer array and determine the frequency of each rating.

public class Responses {
    public static void main(String[] args) {
        int [] responses = {1, 2, 3, 3, 4, 2, 5, 1, 4, 2, 3, 5, 2, 3, 2, 1, 4, 2, 4, 14};
        int [] frequency = new int[6];
        for (int answer = 0; answer < responses.length ; answer++) {
            try {
              ++frequency[responses[answer]];
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.printf(" responses[%d] = %d%n", answer, responses[answer]);
            }
        }
        System.out.printf("%s%10s%n", "Rating", "frequency");

        for (int rating = 0; rating < frequency.length ; rating++) {
            System.out.printf("%6d%10d%n", rating, frequency[rating]);

        }

    }
}
