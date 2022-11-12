package ru.mirea.lab2;

public class Author {
    private String name;
    private String email;
    private char gender; //'M', если автор книги мужчина, 'F' – если автор книги женщина, или 'U' если пол автора неизвестен

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name + " (" + gender + ") at " + email;
    }

}
