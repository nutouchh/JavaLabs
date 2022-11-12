package ru.mirea.lab8;

import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends WaitList<E> {

    UnfairWaitList() {
        super();
    }

    public void remove(E element) {
        content.remove(element);
    }


    void moveToBack(E element) { //перемещение в конец
        if (content.remove(element)) {
            ConcurrentLinkedQueue<E> temp = new ConcurrentLinkedQueue<E>();
            temp.addAll(content);
            temp.add(element);
            content = temp;
        }
    }
}