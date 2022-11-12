package ru.mirea.lab11;

public class Multiply extends Operation{
    public Multiply(IValue... operations) {
        super(operations);
    }
    @Override
    public int getValue() {
        if (arguments.length == 0)
            throw new IllegalArgumentException();
        int result = arguments[0].getValue();
        for (int i=1; i<arguments.length; i++)
            result *= arguments[i].getValue();
        return result;
    }
}