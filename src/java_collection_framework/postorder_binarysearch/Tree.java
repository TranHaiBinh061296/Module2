package java_collection_framework.postorder_binarysearch;

public interface Tree<E> {
    public boolean insert(E e);
    public void postorder();
    public void inorder();
    void preorder();
    int getSize();
    boolean delete(E e);
    boolean search(E e);
}