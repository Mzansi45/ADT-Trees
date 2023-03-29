import java.util.HashSet;


/*class Node<T> {
        private T data;
        private List<Node<T>> children;

        public Node(T data) {
            this.data = data;
            this.children = new ArrayList<>();
        }

        public void addChild(Node<T> child) {
            this.children.add(child);
        }

        public List<Node<T>> getChildren() {
            return this.children;
        }

        public T getData() {
            return this.data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }*/

class Node<T> {
    private T data;
    private HashSet<Node<T>> children;

    public Node(T data) {
        this.data = data;
        this.children = new HashSet<Node<T>>();
    }

    public void addChild(Node<T> child) {
        this.children.add(child);
    }

    public HashSet<Node<T>> getChildren() {
        return this.children;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
