package ru.mirea.lab11;

public class Subtract extends Operation{

    Subtract(IValue... operations) {
        super(operations);
    }
    @Override
    public int getValue() {
        if (arguments.length != 2)
            throw new IllegalArgumentException();
        return arguments[0].getValue() - arguments[1].getValue();
    }
}