class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public int findMin() {
        if (root == null) {
            throw new IllegalStateException("Árvore vazia");
        }
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }


    public int findMax() {
        if (root == null) {
            throw new IllegalStateException("Árvore vazia");
        }
        Node current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    public void preorder() {
        preorderRec(root);
        System.out.println(); // Adiciona uma nova linha após a impressão
    }


    private void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    public void inorder() {
        inorderRec(root);
        System.out.println(); // Adiciona uma nova linha após a impressão
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public void postorder() {
        postorderRec(root);
        System.out.println(); // Adiciona uma nova linha após a impressão
    }

    private void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }
}