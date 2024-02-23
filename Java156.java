package javaq;

//class to create nodes

//class to create nodes


class Java156 {
Node root;

// Traverse tree
public void traverseTree(Node node) {
 if (node != null) {
   traverseTree(node.left);
   System.out.print(" " + node.item);
   traverseTree(node.right);
 }
}

public static void main(String[] args) {

 // create an object of BinaryTree
 Java156 tree = new Java156();

 // create nodes of the tree
 tree.root = new Node(1);
 tree.root.left = new Node(2);
 tree.root.right = new Node(3);
 tree.root.left.left = new Node(4);

 System.out.print("\nBinary Tree: ");
 tree.traverseTree(tree.root);
}
}
