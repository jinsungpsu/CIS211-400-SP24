public class Food {
    private String name;
    private int calories;

    // if no constructor present
    // implied no arg, default constructor is inserted

    public Food() {
        calories = 0;
        name = "gooooo";
    }

    public Food(String name) {
        this.name = name;
        this.calories = 0;
    }

    public Food(String newName, int calories) {
        /*
        If I call Food("Hawaiian", 500)
        String newName = "Hawaiian";
        int calories = 500;
         */
        this.name = newName;
        this.calories = calories;
    }

    /*
    What is a class?
    What is an object?
     */

    public void makeLunchPortion(int calories) {
        this.calories = calories;
        name = "Lunch portion: " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }
}
