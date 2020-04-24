package baitap_binary_search_tree;

public class BinarySearchTree<T extends Comparable<T>>extends AbtractTree<T> {
   protected Node<T>root;
   protected int size=0;

    public BinarySearchTree() {
    }
    protected Node<T> newCreatNode(T e){
        return new Node<T>(e);
    }

    @Override
    public boolean insert(T e) {
       if (root==null){
           root=newCreatNode(e);
       } else{
           Node<T>parent=null;
           Node<T>current=root;
           while (current!=null){
               if (e.compareTo(current.element)>0){
                   parent=current;
                   current=current.right;
               } else if (e.compareTo(current.element)<0){
                   parent=current;
                   current=current.left;
               } else {
                   return false;
               }
           }
           if (e.compareTo(parent.element)>0){
               parent.right=newCreatNode(e);
           } else {
               parent.left=newCreatNode(e);
           }
       }

       size++;
       return true;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void postorder() {
        postorder(root);
    }
    protected void postorder( Node<T> root){
        if (root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println("Phan tu" + root.element);
    }

//    @Override
//    public void delete(T e) {
//      root=deleteNode(root,e);
//
//    }
//    private Node<T>deleteNode( Node<T> node,T e ){
//        if (node==null){
//            return node;
//        } else {
//            Node<T> current=node;
//            if (e.compareTo(current.element)<0){
//                node.left=deleteNode(node.left,e);
//            } else if (e.compareTo(current.element)>0){
//                node.right=deleteNode(current.right,e);
//            } else {
//                if (node.left==null||node.right==null){
//                    Node temp= null;
//                    temp=node.left==null?node.right:node.left;
//                    if (temp==null){
//                        return null;
//                    } else {
//                        return node;
//                    }
//                } else {
//                     Node successor=getSuccessor(e);
//                }
//            }
//        }
//        return node;
//    }
//    private Node getSuccessor( T e){
//
//    }


    @Override
    public void preorder() {
       preorder(root);
    }
    protected void preorder(Node<T> root){
        if (root==null){
            return;
        }
        System.out.println(root.element);
        preorder(root.left);
        preorder(root.right);
    }

}
