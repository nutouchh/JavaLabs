package ru.mirea.lab1;

public class TestBall {
    public static void exec(){
        Ball b1 = new Ball("basketball", 7);
        Ball b2 = new Ball("volleyball");
        Ball b3 = new Ball();

        b2.setSize(4);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

    }
}
