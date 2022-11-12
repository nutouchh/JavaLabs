package ru.mirea.lab2;

public class TestAuthor {

    public static void exec () {
        Author a1 = new Author("Popov Anton", "popova@gmail.com", 'M');
        Author a2 = new Author("Pet Anna", "petann@gmail.com", 'F');
        Author a3 = new Author("Alex", "123alalal@gmail.com", 'U');

        a3.setEmail("alexxx@gmail.com");

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        char a = 'A';
        char b = 'B';

    }

}
