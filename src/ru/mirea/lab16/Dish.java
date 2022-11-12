package ru.mirea.lab16;

public final class Dish implements Item {

    private final float cost;
    private final String name;
    private final String position;

    public Dish(float cost, String name, String position) {
        this.cost = cost;
        this.name = name;
        this.position = position;
    }

    public Dish(String name, String position) {
        this.name = name;
        this.position = position;
        cost = 0;
    }

    @Override
    public float getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                ",description position='" + position + '\'' +
                '}';
    }

}

