package ru.mirea.lab19_20;

public class RandomFunc {

    public static int random(int start, int end) {
        return (int) (Math.random() * (end - start) + start);
    }

    public static String addZero(int n) {
        if (n < 10) {
            return "0" + String.valueOf(n);
        }
        return String.valueOf(n);
    }
}