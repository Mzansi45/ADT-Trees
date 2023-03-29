import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Tree<T> implements Iterable<T> {
    private Node<T> root;

    public Tree(T data) {
        this.root = new Node<>(data);
    }

    public Node<T> getRoot() {
        return this.root;
    }

    public int size() {
        return size(root);
    }

    private int size(Node<T> node) {
        int count = 1;
        for (Node<T> child : node.getChildren()) {
            count += size(child);
        }
        return count;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Iterator<T> elements() {
        List<T> elements = new ArrayList<>();
        elements(root, elements);
        return elements.iterator();
    }

    private void elements(Node<T> node, List<T> elements) {
        elements.add(node.getData());
        for (Node<T> child : node.getChildren()) {
            elements(child, elements);
        }
    }

    public Iterator<Node<T>> positions() {
        List<Node<T>> positions = new ArrayList<>();
        positions(root, positions);
        return positions.iterator();
    }

    private void positions(Node<T> node, List<Node<T>> positions) {
        positions.add(node);
        for (Node<T> child : node.getChildren()) {
            positions(child, positions);
        }
    }

    public Node<T> parent(Node<T> node) {
        return node == root ? null : parent(root, node);
    }

    private Node<T> parent(Node<T> current, Node<T> node) {
        for (Node<T> child : current.getChildren()) {
            if (child == node) {
                return current;
            } else {
                Node<T> parent = parent(child, node);
                if (parent != null) {
                    return parent;
                }
            }
        }
        return null;
    }

    public HashSet<Node<T>> children(Node<T> node) {
        return node.getChildren();
    }

    public Node<T> root() {
        return root;
    }

    @SuppressWarnings("unchecked")
	public HashSet<Node<T>> children(Node<T> node, int index) {
        return ((Node<T>) ((List<T>) node.getChildren()).get(index)).getChildren();
    }

    @Override
    public Iterator<T> iterator() {
        return elements();
    }
}
