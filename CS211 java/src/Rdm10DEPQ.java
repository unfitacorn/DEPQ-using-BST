public class Rdm10DEPQ implements DEPQ {

	Node root;
	int size;
	Node current;
	Node tempParent;
	Node tempNode;
	

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
				

					if (c.compareTo(current.getData()) < 0) {

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

				} else if (c.compareTo(current.getData()) == 0){
					current.nodeSize = current.nodeSize + 1;
					set = true;
				}
			} while (!set);
		}
	}

	
	
	public Comparable getLeast() {
		size--;
		Comparable tempData = 0;

		current = root;
		
		
		
		while(!(current.left == null)){
			current = current.left;
		}
		
		
		if (current.nodeSize > 1){
			current.nodeSize--;
			tempData = current.data;
		}else if(current == root){
			
			tempData = root.data;
			root = root.getRight();
			
		}else if (current.right == null){
			tempData = current.getData();
			current.getParent().setLeft(null);
			
		} else if (current.right != null) {
			
			tempData = current.data;
			tempNode = current;
			current = current.getParent();
			current.setLeft(tempNode.getRight());
			current = tempNode.getRight();
			current.setParent(tempNode.getParent());
			
			
//			current.getParent().setLeft(current.right);
//			current.getRight().setParent(current.getParent());
//			current = null;
			
		}
		
		
		return tempData;
	}

	public Comparable getMost() {
		size--;
		Comparable tempData = 0;

		current = root;
		
		
		
		while(!(current.right == null)){
			current = current.right;
		}
		
		
		if (current.nodeSize > 1){
			current.nodeSize--;
			tempData = current.data;
		}else if(current == root){
			
			tempData = root.data;
			root = root.getLeft();
			
		}else if (current.left == null){
			tempData = current.getData();
			current.getParent().setRight(null);
			
		} else if (current.left != null) {
			
			tempData = current.data;
			tempNode = current;
			current = current.getParent();
			current.setRight(tempNode.getLeft());
			current = tempNode.getLeft();
			current.setParent(tempNode.getParent());
			
		}
		return tempData;
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
		private int nodeSize;

		public Node(Comparable data) {
			this.data = data;
			parent = null;
			left = null;
			right = null;
			nodeSize = 1;
			
		}

		public int getSize() {
			return nodeSize;
		}

		public void setSize(int nodeSize) {
			this.nodeSize = nodeSize;
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
