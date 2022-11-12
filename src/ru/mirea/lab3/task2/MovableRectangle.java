package ru.mirea.lab3.task2;

public class MovableRectangle implements Movable{

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight= new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    private boolean checkX(){
        return (topLeft.ySpeed == bottomRight.ySpeed);
    }
    private boolean checkY(){
        return (topLeft.xSpeed == bottomRight.xSpeed);
    }

    @Override
    public void moveUp() {
        if (checkY()){
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    @Override
    public void moveDown() {
        if (checkY()){
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    @Override
    public void moveLeft() {
        if (checkX()){
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    @Override
    public void moveRight() {
        if (checkX()){
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
