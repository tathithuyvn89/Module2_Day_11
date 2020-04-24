package baitap_ungdung_Arraylist_Linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ProductManage   {
    public ProductManage() {
    }

//    List<Product> productlist= new ArrayList<>();
//
//    void addProduct( Product pro){
//        productlist.add(pro);
//    }
//    void reviseid(String oldValue, String newValue){
//
//       for (int i=0; i<productlist.size();i++){
//           if (productlist.get(i).getId().equalsIgnoreCase(oldValue)){
//               productlist.get(i).setId(newValue);
//
//           }
//       }
//
//    }
//    //Xoa phan tu theo id
//    void delete(String value){
//        int index=-1;
//
//        for (int i=0; i<productlist.size();i++){
//            if (productlist.get(i).getId().equalsIgnoreCase(value)){
//                index=i;
//            }
//        }
//        productlist.remove(index);
//    }
//    //Tim kiem phan tu theo ten
//    void search (String name){
//        int index=-1;
//        for (int i=0; i<productlist.size();i++){
//            if (productlist.get(i).getName().equalsIgnoreCase(name)){
//                index=i;
//            }
//
//        }
//        if (index>=0){Product findValue = productlist.get(index);
//            System.out.println(" Have name"+name+" in list flowing  with infomation "+ productlist.get(index));
//
//        }else {
//            System.out.println("Sorry name "+ name+" not exin in system");
//        }
//    }
//    // Sap xep san pham theo thu tu tang dan cua gia
//    void sortbyRisePrice(){
//        Collections.sort(productlist);
//
//    }
//    // Sap xep san pham theo thu giam dan cua gia
//    void sortbyDecPrice(){
//        MyComperator comperator= new MyComperator();
//        Collections.sort(productlist,comperator);
//    }
//
//
//    public void display() {
//       for (int i=0; i<productlist.size();i++){
//           System.out.println(  productlist.get(i).toString());
//       }
//
//    }
List<Product> productlist= new LinkedList<Product>();

    void addProduct( Product pro){
        productlist.add(pro);
    }
    void reviseid(String oldValue, String newValue){

        for (int i=0; i<productlist.size();i++){
            if (productlist.get(i).getId().equalsIgnoreCase(oldValue)){
                productlist.get(i).setId(newValue);

            }
        }

    }
    //Xoa phan tu theo id
    void delete(String value){
        int index=-1;

        for (int i=0; i<productlist.size();i++){
            if (productlist.get(i).getId().equalsIgnoreCase(value)){
                index=i;
            }
        }
        productlist.remove(index);
    }
    //Tim kiem phan tu theo ten
    void search (String name){
        int index=-1;
        for (int i=0; i<productlist.size();i++){
            if (productlist.get(i).getName().equalsIgnoreCase(name)){
                index=i;
            }

        }
        if (index>=0){Product findValue = productlist.get(index);
            System.out.println(" Have name"+name+" in list flowing  with infomation "+ productlist.get(index));

        }else {
            System.out.println("Sorry name "+ name+" not exin in system");
        }
    }
    // Sap xep san pham theo thu tu tang dan cua gia
    void sortbyRisePrice(){
        Collections.sort(productlist);

    }
    // Sap xep san pham theo thu giam dan cua gia
    void sortbyDecPrice(){
        MyComperator comperator= new MyComperator();
        Collections.sort(productlist,comperator);
    }


    public void display() {
        for (int i=0; i<productlist.size();i++){
            System.out.println(  productlist.get(i).toString());
        }

    }



}
