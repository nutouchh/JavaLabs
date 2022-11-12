package ru.mirea.lab5;

public class Main {
    public static void main(String[] args) {
        Recursions a = new Recursions();
        String str1 = "qwertrewq";
        String str2 = "qwertyuiop";
        System.out.println(a.palindrome(str1, 0, str1.length() - 1));
        System.out.println(a.palindrome(str2, 0, str2.length() - 1));

        System.out.println(a.numberOfSeq(2, 3));
        System.out.println(a.numberOfSeq(2, 1));

        System.out.println(a.reverse(12345, 0));
    }
}
