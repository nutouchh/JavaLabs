package ru.mirea.lab8;

public class BoundedWaitList<E> extends WaitList<E> {

    private int capacity; //макс количество в очереди

    BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) { // если есть место - ок, если нет - то ошибка
        if (content.size() < capacity) {
            super.add(element);
        } else if (content.size() > capacity) {
            throw new Error("Error! [BoundedWaitList] capacity < size");
        }
    }
}