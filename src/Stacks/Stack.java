package Stacks;

import practica03.LinkedList;

import java.util.EmptyStackException;

/**
 * Created by AntonioRang on 9/14/17.
 */
public class Stack<E> implements IStack<E>{

    private LinkedList<E> stack;

    public Stack(){
        stack =new LinkedList<E>();
    }

    @Override
    public E push(E e) {
        stack.addFirst(e);

        return e;
    }

    @Override
    public E pop() {
        if(empty()){
            throw new EmptyStackException();
        }

        return stack.removeFirst();
    }

    @Override
    public E peek() {

        if(empty()){
            throw new EmptyStackException();
        }

        return stack.getFirst();
    }

    @Override
    public boolean empty() {
        return stack.isEmpty();
    }

    @Override
    public Object[] toArray() {
        return stack.toArray();
    }
}
