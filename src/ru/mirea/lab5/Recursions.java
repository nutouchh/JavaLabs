package ru.mirea.lab5;
import java.util.ArrayList;

public class Recursions {

    public static String palindrome(String str, int start, int end){
        if (start >= end)
            return "YES";
        if (str.charAt(start) != str.charAt(end))
            return "NO";
        return palindrome(str, ++start, --end);

    }

    public static int numberOfSeq (int a, int b){
        if (a > b + 1) return 0;
        if (a == 0 || b == 0) return 1;
        return numberOfSeq(a, b-1) + numberOfSeq(a - 1, b -1);
    }

    public static int reverse(int n, int res) {
        if (n == 0)
            return res;
        else
            return reverse(n / 10, 10* res +n % 10);
    }

}


