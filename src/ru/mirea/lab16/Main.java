package ru.mirea.lab16;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        Dish fish = new Dish("Fish", "Grill");

        order.add(new Dish(1000, "Paste", "Carbonara"));
        order.add(fish);
        order.add(new Drink(5, "Cocktail", "Pina colada"));
        System.out.println(order);

        order.remove(fish);
        System.out.println(order);
    }
}
