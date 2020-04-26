import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList arrayList= new  ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(1,3);
        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);
        System.out.println("Set at "+ arrayList.set(1,5));
        System.out.println(arrayList);
        arrayList.add(5);
        System.out.println(arrayList);
    }
}
