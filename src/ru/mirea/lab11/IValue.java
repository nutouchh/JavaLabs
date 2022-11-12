package ru.mirea.lab11;

import java.util.ArrayDeque;

public interface IValue {
    int getValue();

    public void initialize(ArrayDeque<Integer> variableValues);
}