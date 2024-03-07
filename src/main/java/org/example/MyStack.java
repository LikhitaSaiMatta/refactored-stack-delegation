package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E> extends ArrayList<E>{

    private ArrayList<E> delegate;

    public MyStack(){
        this.delegate = this;
    }

    public void push(E e) {
        this.delegate.add(e);
    }

    public E pop() {
        if (this.delegate.isEmpty()) throw new EmptyStackException();
        E e = this.delegate.get(this.delegate.size() - 1);
        this.delegate.remove(size() -1 );
        return e;
    }

}
