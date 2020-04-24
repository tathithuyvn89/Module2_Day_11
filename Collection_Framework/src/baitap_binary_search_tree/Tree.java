package baitap_binary_search_tree;

public interface Tree<T> {
    boolean insert(T e);
    int getSize();
    void postorder();
    void delete(T e);
    void preorder();
    T search( T e);

}
