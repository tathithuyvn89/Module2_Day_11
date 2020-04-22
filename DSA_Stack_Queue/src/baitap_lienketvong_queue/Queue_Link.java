package baitap_lienketvong_queue;

public class Queue_Link<T> {
    private Node front;
    private Node rear;
    private int size=0;

    private class Node<T> {
        T element;
        Node link;

        public Node(T element) {
            this.element = element;
        }
    }
    public Queue_Link(){

    }
    public void enQueue (T element){
        Node temp= new Node(element);
        if (front==null){
          front= rear= temp;
        } else {
            rear.link=temp;
            rear=temp;
        }
        size++;
    }
    public T deQueue(){

        if(front==null){
            return  null;
        } else {
            Node temp= front;
            front=front.link;
            if (front==null){
                rear=null;
            }
            size--;
            return (T) temp.element;
        }
    }
    public T get(int index){
        if (index<0||index>size){
            return null;
        } else if (index==0){
            return (T)front.element;
        } else if(index==size-1){
            return (T)rear.element;
        } else {
            Node temp= front;
            for (int i=1; i<=index;i++){
                temp=temp.link;
            }
            return (T) temp.element;
        }

    }
    public int getSize(){
        return size;
    }




}
