package ru.mirea.lab1;

public class Book {
    private String name;
    private int numOfPages;

    public Book (String name, int numOfPages) {
        this.name = name;
        this.numOfPages = numOfPages;
    }
    public Book (String name) {
        this.name = name;
        this.numOfPages = 100;
    }
    public Book () {
        this.name = "No name";
        this.numOfPages = 100;
    }
    public void setNameBook(String name){
        this.name = name;
    }
    public void setNumOfPages(int numOfPages){
        this.numOfPages = numOfPages;
    }
    public String getNameBook(){
        return name;
    }
    public int getNumOfPages() {
        return numOfPages;
    }

    @Override
    public String toString() {
        return "Book name: " + this.name + ", number of pages = " + this.numOfPages;
    }
}
