package ru.mirea.lab8.task5;

public class FuncString {
    public enum FormType {
        ERROR,
        SUCCESS,
    }

    public FormType type;
    public StringBuilder res;

    public FuncString(FormType type, StringBuilder res) {
        this.type = type;
        this.res = res;
    }

    public FuncString() {}
}
