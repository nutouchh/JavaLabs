package ru.mirea.lab17_18;

public class Main {
    public static void main(String[] args) {
        String testStr1 = "abcdefghijklmnopqrstuv18340";
        String testStr2 = "abcdefghijklmnoasdfasdpqrstuv18340";

        String regex = "^abcdefghijklmnopqrstuv18340$";
        System.out.println(App.check(testStr1, regex));
        System.out.println(App.check(testStr2, regex));

        testStr1 = "aE:dC:cA:56:76:54";
        testStr2 = "01:23:45:67:89:Az";
        regex = "^[a-z][A-Z]:[a-z][A-Z]:[a-z][A-Z]:\\d{2}:\\d{2}:\\d{2}$";
        System.out.println(App.check(testStr1, regex));
        System.out.println(App.check(testStr2, regex));

        testStr1 = "ля-ля-ля-ля-ля 23.78 USD ля-ля-ля-ля-ля";
        testStr2 = "ля-ля-ля-ля-ля 22 UDD, 0.002 USD ля-ля-ля-ля-ля";
        regex = "\\d+\\.\\d{1,2} (USD)|(RUR)|(EU)";
        System.out.println(App.check(testStr1, regex));
        System.out.println(App.check(testStr2, regex));
    }
}
