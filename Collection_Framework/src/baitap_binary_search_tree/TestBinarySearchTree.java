package baitap_binary_search_tree;

public class TestBinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree= new BinarySearchTree<>();
        tree.insert(23);
        tree.insert(30);
        tree.insert(25);
        tree.insert(17);
        tree.insert(36);
        tree.insert(15);
        tree.insert(20);

        System.out.println("Size of tree "+tree.getSize());
        tree.postorder();
        System.out.println("======================");
        tree.preorder();


    }
}
