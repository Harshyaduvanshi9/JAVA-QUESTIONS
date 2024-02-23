package javaq;



	class Java157 {
	  // root of Tree
	  Node root;

	  Java157() {
	  root = null;
	  }

	  void preorder(Node node) {
	    if (node == null)
	      return;

	    // traverse the root node
	    System.out.print(node.item + "->");
	    // traverse the left child
	    preorder(node.left);
	    // traverse the right child
	    preorder(node.right);
	  }

	  public static void main(String[] args) {
	    // create object of tree
	    Java157 tree = new Java157();

	    // create nodes of the tree
	    tree.root = new Node(1);
	    tree.root.left = new Node(12);
	    tree.root.right = new Node(9);
	    tree.root.left.left = new Node(5);
	    tree.root.left.right = new Node(6);

	    // preorder tree traversal
	    System.out.println("\nPreorder traversal ");
	    tree.preorder(tree.root);
	  }
	}
