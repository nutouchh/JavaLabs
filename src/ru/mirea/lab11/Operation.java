package ru.mirea.lab11;

import java.util.ArrayDeque;

public abstract class Operation implements IValue{
    protected final IValue[] arguments;
    public Operation(IValue... operations) {
        this.arguments = operations;
    }

    public final int evaluate(int... params) {
        ArrayDeque<Integer> values = new ArrayDeque<Integer>(params.length);
        for (int i : params)
            values.add(i);
        initialize(values);
        return getValue();
    }

    @Override
    public final void initialize(ArrayDeque<Integer> variableValues) {
        for (IValue value :arguments)
            value.initialize(variableValues);
    }
}

