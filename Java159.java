package javaq;



	class Java159 {
	  // root of Tree
	  Node root;

	  Java159() {
	  root = null;
	  }

	  void inOrder(Node node) {
	    if (node == null)
	      return;

	    // traverse the left child
	    inOrder(node.left);

	    // traverse the root node
	    System.out.print(node.item + "->");

	    // traverse the right child
	    inOrder(node.right);
	  }


	  public static void main(String[] args) {

	    // create an object of Tree
	    Java159 tree = new Java159();

	    // create nodes of tree
	    tree.root = new Node(1);
	    tree.root.left = new Node(12);
	    tree.root.right = new Node(9);

	    // create child nodes of left child
	    tree.root.left.left = new Node(5);
	    tree.root.left.right = new Node(6);

	    System.out.println("In Order traversal");
	    tree.inOrder(tree.root);
	  }
	}
