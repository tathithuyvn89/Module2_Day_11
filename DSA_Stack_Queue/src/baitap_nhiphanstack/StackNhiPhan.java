package baitap_nhiphanstack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class StackNhiPhan<T> {
    private LinkedList<T> stack;
    public StackNhiPhan(){
        stack= new LinkedList<>();
    }
    public void push ( T element ){
        stack.addFirst(element);
    }
    public T pop(){
        if (isEmpty()){
            throw new  EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }
    public T getElement(int index){
        return stack.get(index);
    }
    public boolean isEmpty(){
       if ( stack.size()==0){
           return true;
       }
       return false;
    }

}
