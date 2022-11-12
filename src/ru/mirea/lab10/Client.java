package ru.mirea.lab10;

public class Client {

    Chair chair;

    void sit() {
        System.out.println("Have a sit?");
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}