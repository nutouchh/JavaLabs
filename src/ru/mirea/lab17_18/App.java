package ru.mirea.lab17_18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static boolean check(String str, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        return matcher.find();
    }


}
