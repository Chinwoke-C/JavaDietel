package Chapter8;

public enum Food {
    FIRST_FRUIT("APPLE",40),
    SECOND_FRUIT("BANANA",45),
    THIRD_FRUIT("CARROT",30);


    private final String fruit;
    private final int calories;
    Food(String fruit, int calories){
        this.fruit = fruit;
        this.calories = calories;
    }

    public String getFruit() {
        return fruit;
    }

    public int getCalories() {
        return calories;
    }
}
