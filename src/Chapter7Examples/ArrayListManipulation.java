package Chapter7Examples;

import java.util.ArrayList;

public class ArrayListManipulation {
    public static void main(String[] args) {
        ArrayList <String> items = new ArrayList<>();
        items.add("red");
        items.add(0,"yellow");

        System.out.print(
                "Display list contents with counter-controlled loop:");
        for (int i = 0; i < items.size() ; i++) {
            System.out.printf("%s%n are the arraylist items ",items.get(i));
        }

            displayList(items,"%n");

            items.add("green");
            items.add("yellow");
            displayList(items,"List with two new elements");

            items.remove("yellow");
            displayList(items, "remove second list element yellow");

            items.remove(1);
            displayList(items,"Remove second list element (green): ");

            System.out.printf("\"red\" is %sin the list%n",
                    items.contains("red")? "": "not ");
            System.out.printf("Size: %s%n", items.size());


    }

    private static void displayList(ArrayList<String> items, String header) {
        System.out.printf(header);

        for (String item : items){
            System.out.printf(" %s", item);
    }
        System.out.println();

}
}
