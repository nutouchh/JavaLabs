package ru.mirea.lab11;

public class Main {

    public static void main(String[] args) {
        int evaluate = new Subtract(
                new Multiply(
                        new Const(2),
                        new Variable("x")
                ),
                new Const(3)
        ).evaluate(5);
        System.out.println("eval = " + evaluate);
    }
}
