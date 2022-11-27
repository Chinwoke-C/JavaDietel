package Chapter8;

import java.util.Arrays;
import java.util.EnumSet;

public class EnumFoodTest {
    public static void main(String[] args) {
        System.out.println("All food");
        for (Food food:Food.values()) {
            System.out.printf("%s %-45s%skcal%n",food,
                    food.getFruit(),food.getCalories());
        }
        System.out.println("Display a range of enum constants");
        for (Food food: EnumSet.range(Food.FIRST_FRUIT,Food.SECOND_FRUIT)) {
            System.out.printf("%s %-45s%skcal%n",food, food.getFruit(),food.getCalories());

        }

    }
}
