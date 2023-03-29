public class BinarySearchTree {
    // Define a node class for the tree
    private static class Node {
        int data;
        Node left;
        Node right;
        
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    // Define the root node of the tree
    private Node root;
    
    // Constructor for the tree
    public BinarySearchTree() {
        this.root = null;
    }
    
    // Insert a new node with the given value into the tree
    public void insert(int value) {
        Node newNode = new Node(value);
        
        if (root == null) {
            root = newNode;
            return;
        }
        
        Node currentNode = root;
        while (true) {
            if (value < currentNode.data) {
                if (currentNode.left == null) {
                    currentNode.left = newNode;
                    return;
                }
                currentNode = currentNode.left;
            } else {
                if (currentNode.right == null) {
                    currentNode.right = newNode;
                    return;
                }
                currentNode = currentNode.right;
            }
        }
    }
    
    // Perform a preorder traversal of the tree
    public void preorderTraversal() {
        preorderTraversalHelper(root);
    }
    
    // Helper method for preorder traversal
    private void preorderTraversalHelper(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderTraversalHelper(node.left);
            preorderTraversalHelper(node.right);
        }
    }
    
    // Perform an inorder traversal of the tree
    public void inorderTraversal() {
        inorderTraversalHelper(root);
    }
    
    // Helper method for inorder traversal
    private void inorderTraversalHelper(Node node) {
        if (node != null) {
            inorderTraversalHelper(node.left);
            System.out.print(node.data + " ");
            inorderTraversalHelper(node.right);
        }
    }
    
    // Perform a postorder traversal of the tree
    public void postorderTraversal() {
        postorderTraversalHelper(root);
    }
    
    // Helper method for postorder traversal
    private void postorderTraversalHelper(Node node) {
        if (node != null) {
            postorderTraversalHelper(node.left);
            postorderTraversalHelper(node.right);
            System.out.print(node.data + " ");
        }
    }
}
