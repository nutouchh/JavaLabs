package ru.mirea.lab12_15.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {

    String formattedPhone;

    public Phone(String phone) {
        if (phone.charAt(0) != '+') {
            phone = "+7" + phone.substring(1);
        }

        String regex = "(\\+\\d+)(\\d{3})(\\d{3})(\\d{4})$";
        Pattern pattern = Pattern.compile(regex); //шаблон
        Matcher matcher = pattern.matcher(phone); //поиск
        matcher.find();

        formattedPhone =
                new StringBuffer()
                        .append(matcher.group(1))
                        .append(matcher.group(2))
                        .append('-')
                        .append(matcher.group(3))
                        .append('-')
                        .append(matcher.group(4))
                        .toString();
    }
}