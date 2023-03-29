public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;

    private static class Node<T> {
        private T data;
        private Node<T> left, right;

        public Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public BinaryTree() {
        this.root = null;
    }

    public void insert(T data) {
        this.root = insertHelper(this.root, data);
    }

    private Node<T> insertHelper(Node<T> node, T data) {
        if (node == null) {
            return new Node<>(data);
        }
        if (data.compareTo(node.data) < 0) {
            node.left = insertHelper(node.left, data);
        } else {
            node.right = insertHelper(node.right, data);
        }
        return node;
    }

    public boolean contains(T data) {
        return containsHelper(this.root, data);
    }

    private boolean containsHelper(Node<T> node, T data) {
        if (node == null) {
            return false;
        }
        if (data.compareTo(node.data) == 0) {
            return true;
        } else if (data.compareTo(node.data) < 0) {
            return containsHelper(node.left, data);
        } else {
            return containsHelper(node.right, data);
        }
    }
    
    public void preorderTraversal() {
        preorderHelper(this.root);
    }
    
    private void preorderHelper(Node<T> node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderHelper(node.left);
            preorderHelper(node.right);
        }
    }
    
    public void inorderTraversal() {
        inorderHelper(this.root);
    }
    
    private void inorderHelper(Node<T> node) {
        if (node != null) {
            inorderHelper(node.left);
            System.out.print(node.data + " ");
            inorderHelper(node.right);
        }
    }
    
    public void postorderTraversal() {
        postorderHelper(this.root);
    }
    
    private void postorderHelper(Node<T> node) {
        if (node != null) {
            postorderHelper(node.left);
            postorderHelper(node.right);
            System.out.print(node.data + " ");
        }
    }
}

