
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree tree = new BinarySearchTree();
		BinaryTree<Integer> tree2 = new BinaryTree<>();
		
		tree.insert(5);
		tree.insert(3);
		tree.insert(7);
		tree.insert(2);
		tree.insert(4);
		tree.insert(6);
		tree.insert(8);
		
		tree2.insert(5);
		tree2.insert(3);
		tree2.insert(7);
		tree2.insert(2);
		tree2.insert(4);
		tree2.insert(6);
		tree2.insert(8);

		System.out.print("Preorder traversal: ");
		tree.preorderTraversal(); // Output: 5 3 2 4 7 6 8
		System.out.print("\nInorder traversal: ");
		tree.inorderTraversal(); // Output: 2 3 4 5 6 7 8
		System.out.print("\nPostorder traversal: ");
		tree.postorderTraversal(); // Output: 2 4 3 6 8 7 5
		
		System.out.println();
		System.out.println();
		
		System.out.print("Preorder traversal: ");
		tree2.preorderTraversal(); // Output: 5 3 2 4 7 6 8
		System.out.print("\nInorder traversal: ");
		tree2.inorderTraversal(); // Output: 2 3 4 5 6 7 8
		System.out.print("\nPostorder traversal: ");
		tree2.postorderTraversal(); // Output: 2 4 3 6 8 7 5
	}

}
