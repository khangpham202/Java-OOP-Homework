class BST {
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Nút gốc
    Node root;

    
    BST() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {

        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    void preorder() {
        preorderRec(root);
    }

    void inorder() {
        inorderRec(root);
    }

    void postorder() {
        postorderRec(root);
    }

    // hàm thực hiện việc sắp xếp và in ra cây nhị phân đã được sắp xếp
    void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key + " ");
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();

        tree.insert(15);
        tree.insert(6);
        tree.insert(4);
        tree.insert(7);
        tree.insert(23);

        System.out.print("Preorder traversal => ");
        tree.preorder();
        System.out.print("\nInorder traversal => ");
        tree.inorder();
        System.out.print("\nPostorder traversal => ");
        tree.postorder();
    }
}