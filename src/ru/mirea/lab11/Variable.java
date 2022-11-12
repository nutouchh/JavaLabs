package ru.mirea.lab11;

import java.util.ArrayDeque;

public class Variable implements IValue{
    String name;
    boolean initialized = false;
    private int value;

    Variable(String name) {
        this.name = name;
    }

    @Override
    public int getValue() {
        if (!initialized)
            throw new IllegalStateException();
        return value;
    }

    @Override
    public void initialize(ArrayDeque<Integer> variableValues) {
        this.value = variableValues.pop();
        initialized = true;
    }
}