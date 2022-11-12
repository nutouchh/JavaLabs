package ru.mirea.lab1;

public class TestBook {
    public static void exec(){
        Book book1 = new Book("War and Peace", 576);
        Book book2 = new Book("1984");
        Book book3 = new Book();

        book3.setNameBook("Lolita");

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
