public class Rdm10DEPQ implements DEPQ {

	Node root;
	int size;
	Node current;
	Node tempParent;

	public Rdm10DEPQ() {
		Node root = null;
		Node current = null;
		int size = 0;
		Node tempParent;
	}

	public Comparable inspectLeast() {
		
		current = root;
		
		while(!(current.left == null)){
			current = current.left;
		}
		return (current.data);
	}

	public Comparable inspectMost() {
		current = root;
		
		while(!(current.right == null)){
			current = current.right;
		}
		return (current.data);
	}

	 
	
	
	public void add(Comparable c) {

		boolean set = false;
		size++;

		if (root == null) {
			root = new Node(c);
			set = true;
		} else {

			current = root;

			do {
				tempParent = current;
				

					if (c.compareTo(current.getData()) <= 0) {

						current = current.left;
					
						if (current == null) {
								tempParent.left = new Node(c);
								tempParent.left.parent = tempParent;
								set = true;
						}
						

					} else if (c.compareTo(current.getData()) > 0) {

					current = current.right;
					
					if (current == null) {
							tempParent.right = new Node(c);
							tempParent.right.parent = tempParent;
							set = true;
					}

				}
			} while (!set);
		}
	}

	
	
	public Comparable getLeast() {
		size--;
		
		return null;
	}

	public Comparable getMost() {
		size--;

		return null;
	}

	public boolean isEmpty() {

		return (size == 0);
	}

	public int size() {

		return size;
	}

	// ___________________________________________NODE
	// METHODS____________________________________________

	private class Node implements Comparable<Node> {

		private Comparable data;
		private Node parent;
		private Node left;
		private Node right;

		public Node(Comparable data) {
			this.data = data;
			parent = null;
			left = null;
			right = null;
		}

		public Comparable getData() {
			return data;
		}

		public void setData(Comparable data) {
			this.data = data;
		}

		public Node getParent() {
			return parent;
		}

		public void setParent(Node parent) {
			this.parent = parent;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

		public int compareTo(Node o) {
			return 0;
		}
	}

}