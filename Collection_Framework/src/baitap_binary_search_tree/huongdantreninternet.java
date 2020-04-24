//package baitap_binary_search_tree;
//
//public class huongdantreninternet {
//    Node root;
//
//    public huongdantreninternet() {
//        root=null;
//    }
//    //Chen phan tu vao cay nhi phan
//    Node insertRect( Node newKey, int key){
//        if (root==null){
//            root= new Node(key);
//            return root;
//        }
//        if (key<root.key){
//            root.left=insertRect(root.left,key);
//        } else if (key>root.key) {
//            root.right=insertRect(root.right,key);
//        }
//        return root;
//
//    }
//    //Duyet cay nhi phan
//    public void inorderRec(Node root){
//        if (root!=null){
//            inorderRec(root.left);
//            System.out.println(root.key);
//            inorderRec(root.right);
//        }
//    }
//    //Tim kiem tren cay nhi phan
//    public Node search(Node root, int key){
//        if (root==null||root.key==key){
//            return root;
//        } else if (root.key>key){
//            return search(root.left,key);
//        } else {
//            return search(root.right,key);
//        }
//
//    }
//    //Xoa tren cay nhi phan
//    void deleteKey(int key){
//        root=deleteRec(root,key);
//    }
//    //Dung ham de quy de xoa phan tu khoi mang
//    Node deleteRec(Node root, int key){
//        if (root==null){
//            return root;
//        } else {
//            if (key<root.key){
//                root.left=deleteRec(root.left,key);
//            } else if (key>root.key){
//                root.right=deleteRec(root.right,key);
//            } else {
//                if (root.left==null){
//                    return root.right;
//                } else if(root.right==null){
//                    return root.left;
//                } else {
//                    root.key=minValue(root.right);
//                    root.right=deleteRec(root.right,root.key);
//                }
//
//            }
//        }
//        return root;
//
//    }
//    int minValue(Node root){
//        int minv=root.key;
//        while (root.left!=null){
//            minv=root.left.key;
//            root=root.left;
//        }
//        return minv;
//    }
//}
/*
public int findTheMostOfLeft(Node root){
        while (root.left != null){
            root = root.left;
        }
        return root.number;
    }
    public void delete(int number){
        root = delete(root,number);
    }
 public Node delete(Node root,int number){
        if( root == null)
            return null;
        if( number < root.number){
            root.left = delete(root.left,number);
        } else if(number > root.number)
            root.right = delete(root.right,number);
        else {
            if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;
            root.number = findTheMostOfLeft(root.right);
            root.right = delete(root.right,root.number);
        }
        return root;
    }

 */