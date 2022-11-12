package ru.mirea.lab16;

public final class Drink implements Item {

    private final float cost;
    private final String name;
    private final String position;

    public Drink(float cost, String name, String position) {
        this.cost = cost;
        this.name = name;
        this.position = position;
    }

    public Drink(String name, String position) {
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
        return "Drink{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                ",description position='" + position + '\'' +
                '}';
    }

}

