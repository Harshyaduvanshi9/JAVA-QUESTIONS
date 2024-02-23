package javaq;



	class Java158 {
	  // root of Tree
	  Node root;

	  Java158() {
	  root = null;
	  }

	  void postorder(Node node) {
		    if (node == null)
		      return;

		    // traverse the left child
		    postorder(node.left);

		    // traverse the right child
		    postorder(node.right);

		    // traverse the root node
		    System.out.print(node.item + "->");
		  }


	  public static void main(String[] args) {

	    // create an object of Tree
	    Java158 tree = new Java158();

	    // create nodes of tree
	    tree.root = new Node(1);
	    tree.root.left = new Node(12);
	    tree.root.right = new Node(9);

	    // create child nodes of left child
	    tree.root.left.left = new Node(5);
	    tree.root.left.right = new Node(6);

	    System.out.println("Post Order traversal");
	    tree.postorder(tree.root);
	  }
	}
