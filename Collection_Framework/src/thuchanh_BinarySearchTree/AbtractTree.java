package thuchanh_BinarySearchTree;

public abstract class AbtractTree<E>implements Tree<E> {
    @Override
    public boolean insert(E e) {
        return false;
    }

    @Override
    public void inorder() {

    }

    @Override
    public int getSize() {
        return 0;
    }
}
