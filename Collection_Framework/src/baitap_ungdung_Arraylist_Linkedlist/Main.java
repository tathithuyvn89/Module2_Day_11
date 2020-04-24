package baitap_ungdung_Arraylist_Linkedlist;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Tryen tranh1","AB01",13000);
        Product product2 = new Product("Tryen tranh2","AB02",12000);
        Product product3 = new Product("Tryen tranh3","AB03",16000);
        Product product4 = new Product("Tryen tranh4","AB04",18000);
        ProductManage productManage= new ProductManage();
        productManage.addProduct(product1);
        productManage.addProduct(product2);
        productManage.addProduct(product3);
        productManage.addProduct(product4);
        productManage.display();
        System.out.println("Sau khi revised id: ");
        productManage.reviseid("Ab04","AB0100");
        productManage.display();
        System.out.println("Sau khi delete id =\"AB03\", ket qua: ");
        productManage.delete("ab03");
        productManage.display();
        System.out.println("Tim kiem theo ten san pham");
        productManage.search("Tryen tranh4");
        System.out.println("Sap xep theo thu tu tang dan su dung comparabe");
        productManage.sortbyRisePrice();
        productManage.display();
        System.out.println("Sap xep theo thu tu giam dan su dung comparator");
        productManage.sortbyDecPrice();
        productManage.display();



    }
}
