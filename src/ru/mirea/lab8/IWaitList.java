package ru.mirea.lab8;
import java.util.Collection;

public interface IWaitList<E>{


    static void asd(){
        System.out.println("fkfk");

    }

    default void df(){
        System.out.println("fkfk");
    }
    void add(E element);
    E remove();
    boolean contains(E element);
    boolean containsAll(Collection<E> c);
    boolean isEmpty();
}
