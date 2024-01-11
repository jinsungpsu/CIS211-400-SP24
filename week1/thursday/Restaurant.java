public class Restaurant {
    public static void main(String[] args) {
        Food pizza = new Food();
        // setters/getters
        // are needed if we want to provide
        // access to anything inside
        // of the class
        // pizza.calories = 0;
        pizza.setCalories(0);


        Food pizza2 = new Food("Hawaiian", 500);
    }
}
