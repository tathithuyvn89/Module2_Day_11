package baitap_daonguocphantusonguyen_useStack;

public class MyArray1  {
    int arr[];
    private int size;
    private int index;

    public MyArray1(int n){
        this.size=n;
        arr=new int[n];
    }
    public void push(int element ){
        if (isFull()){
            throw new StackOverflowError("Stack is full");
        }
        arr[index++]=element;
    }
    public int pop() throws Exception {
        if (isEmpty()){
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }
    public int getElement(int index){
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
