package ru.mirea.lab1;

public class Ball {
    private String type;
    private int size;
    public Ball(String type, int size){
        this.type = type;
        this.size = size;
    }
    public Ball(String type){
        this.type = type;
        this.size = 5;
    }
    public Ball(){
        this.type = "football";
        this.size = 5;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setSize(int size){
        this.size = size;
    }
    public String getType(){
        return type;
    }
    public int setSize(){
        return size;
    }
    @Override
    public String toString(){
        return "size = " + this.size + ", type - " + this.type;
    }

}
