package baitap_daonguocphantusonguyen_useStack;

public class WStack {
    String arr[];
    private int size;
    private int index;

    public WStack(int n){
        this.size=n;
        arr=new String[n];
    }
    public void push(String element ){
        if (isFull()){
            throw new StackOverflowError("Stack is full");
        }
        arr[index++]=element;
    }
    public String pop() throws Exception {
        if (isEmpty()){
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }
    public String getElement(int index){
        return arr[index];
    }
    public int size(){
        return index;
    }

    public boolean isFull(){
        if (index==size){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if (index==0){
            return true;
        }
        return false;
    }


}

