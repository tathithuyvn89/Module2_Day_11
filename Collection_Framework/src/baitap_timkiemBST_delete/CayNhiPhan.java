package baitap_timkiemBST_delete;

import baitap_binary_search_tree.Node;

public class CayNhiPhan <T extends Comparable> {
    private MyNode<T> root;
    public void insert(T t){
        if (root==null){
            root=new MyNode<>(t);
        } else {
            MyNode<T> currentMyNode=root;
            while (currentMyNode!=null){
                int compareResult= t.compareTo(currentMyNode.element);
                if (compareResult>0){
                    //Move right
                    if (currentMyNode.right==null){
                        currentMyNode.right=new MyNode<>(t);
                        break;
                    } else {
                        currentMyNode=currentMyNode.right;
                    }
                } else if (compareResult<0){
                    //Move left
                    if (currentMyNode.left==null){
                        currentMyNode.left=new MyNode<>(t);
                        break;
                    } else {
                        currentMyNode=currentMyNode.left;
                    }
                } else {
                    throw new RuntimeException("Giá trị này đã tồn tại trong BST.");
                }
            }

        }
    }
    //Duyet cay nhi phan tu goc den la
    public void sapSep (){
        sapXep(root);
    }
    private void sapXep(MyNode<T> root){
        if (root==null){
            return;
        }
            sapXep(root.left);
            System.out.println(root.element);
            sapXep(root.right);

    }

    public boolean search(T e) {
        MyNode<T> currentNode = root;
        if (currentNode == null) {
            throw new RuntimeException("Ngoai le");
        } else {

            while (currentNode != null) {
                int compareResult = e.compareTo(currentNode.element);
                if ( compareResult > 0) {
                    currentNode = currentNode.right;
                } else if (compareResult< 0)  {
                    currentNode = currentNode.left;
                } else {
                    return true;
                }

            }
        }

        return false;
    }
//public Boolean search(T e) {
//    MyNode<T> current = root;
//    if (current == null) {
//        throw new RuntimeException("ngoai le");
//    } else {
//        while (current != null) {
//            if (current.element.compareTo(e) > 0) {
//                current = current.left;
//            } else if (current.element.compareTo(e) < 0) {
//                current = current.right;
//            } else {
//               return true ;
//               }
//        }
//    }
//    return false;
//}
    // Ham nay tao ra de tim gia tri nho nhat ve phia trai hoac phai, neu muon tim gia tri nho nhat cua tree
    public T findMinLeft(MyNode <T> root){
        while (root!=null){
            root=root.left;

        }
        return root.element;
    }
    public void delElement(T e){
        System.out.println(root= deleteNode(root,e));
        root= deleteNode(root,e);

    }
    private MyNode<T> deleteNode( MyNode<T> root , T e){

        if (root==null){
            return root;

        } else {

            if (e.compareTo(root.element)>0){
                deleteNode(root.right,e);
            } else if (e.compareTo(root.element)<0){
                deleteNode(root.left,e);
            } else {
                if (root.left==null){
                    return root.right;
                } else if (root.right==null){
                    return root.left;
                } else {
                    root.element=findMinLeft(root.right);
                    root.right=deleteNode(root.right,root.element);
                }
            }
        }
        return root;

    }


}
