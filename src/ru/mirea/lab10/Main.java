package ru.mirea.lab10;

public class Main {
    public static void main(String[] args) {

        VictorianChair vc = new VictorianChair(123);
        MagicChair mc = new MagicChair();
        FunctionalChair fc = new FunctionalChair();

        System.out.println(vc.getAge());
        mc.doMagic();
        System.out.println(fc.sum(2, 5));

    }
}
