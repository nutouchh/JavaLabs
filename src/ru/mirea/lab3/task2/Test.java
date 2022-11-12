package ru.mirea.lab3.task2;

public class Test {

    public static void exec(){
        MovablePoint p = new MovablePoint(2, 5, 6, 10);
        System.out.println(p);
        p.moveUp();
        p.moveRight();
        System.out.println(p);

        MovableCircle c = new MovableCircle(2, 5, 6, 10, 50);
        System.out.println(c);
        c.moveUp();
        c.moveLeft();
        System.out.println(c);

        MovableRectangle r = new MovableRectangle(2, 4, 0, 0, 26, 10);
        System.out.println(r);
        r.moveUp();
        r.moveRight();
        System.out.println(r);
    }
}
