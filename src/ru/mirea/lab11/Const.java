package ru.mirea.lab11;

import java.util.ArrayDeque;

public class Const implements IValue{
    private final int value;
    Const(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void initialize(ArrayDeque<Integer> variableValues) {
    }
}