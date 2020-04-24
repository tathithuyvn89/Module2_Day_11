package baitap_timkiemBST_delete;

public class Main {
    public static void main(String[] args) {
        CayNhiPhan<Integer> ll= new CayNhiPhan<>();
        ll.insert(34);
        ll.insert(25);
        ll.insert(39);
        ll.insert(78);
        ll.insert(12);
        ll.insert(35);
        ll.sapSep();
        System.out.println("Co gia tri 25 trong list phai khong? "+ll.search(34));
        System.out.println("Co gia tri 25 trong list phai khong? "+ll.search(25));
        System.out.println("Co gia tri 25 trong list phai khong? "+ll.search(39));
        System.out.println("Co gia tri 25 trong list phai khong? "+ll.search(78));
        System.out.println("Co gia tri 25 trong list phai khong? "+ll.search(12));
        System.out.println("Co gia tri 25 trong list phai khong? "+ll.search(35));
        System.out.println("Co gia tri 25 trong list phai khong? "+ll.search(100));
        ll.delElement(35);
        ll.sapSep();
    }
}
