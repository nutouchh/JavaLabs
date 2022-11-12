package ru.mirea.lab21_22;

public class CreateTextD implements ICreateDocument {

    @Override
    public IDocument CreateNew() {
        System.out.println("я новый текстовый документ");
        return new TextDocument();
    }
    @Override
    public IDocument CreateOpen() {
        System.out.println("я открылся");
        return new TextDocument();
    }
}
