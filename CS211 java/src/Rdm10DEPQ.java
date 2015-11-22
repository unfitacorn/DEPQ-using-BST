/**
 * <p>
 * Created for assignment CS21120. I decided I would implement a binary search
 * tree as I thought it would be easy enough to implement and how I would
 * implement it.
 * </p>
 * 
 * <p>
 * Firstly I implemented the class Rdm10DEPQ as it would need to use the methods
 * that were created in the DEPQ interface. This is why I have used 'implements
 * DEPQ'.
 * </p>
 * 
 * <p>
 * I decided to use HTML for some of the javadoc as it would be easier to
 * format.
 * </p>
 * 
 * <p>
 * The Resources I used:
 * <ul>
 * <li>The DEPQ.java created by Bernie Tinderman.Which is the interface for this
 * class</li>
 * <li>The DEPQTest.java created by Bernie Tinderman which was a JUnit class to
 * test the DEPQ</li>
 * <li>Used to help create the add function [1] - <a href=
 * "http://algorithms.tutorialhorizon.com/binary-search-tree-complete-implementation/"
 * > Click here to view site </a></li>
 * </ul>
 * </p>
 * 
 * <p>
 * <b>References:</b>
 * </p>
 * <p>
 * [1] -SJ. (2015, November 18). Binary Search Tree Complete Implementation.
 * Retrieved from tutorialhorizon:
 * http://algorithms.tutorialhorizon.com/binary-search
 * -tree-complete-implementation/
 * 
 * </p>
 * 
 * <p>
 * <b>Complexity Analysis:</b>
 * </p>
 * <p>
 * 
 * 
 * <b>Inspect Least and Most Methods</b>
 * <p>
 * Within the inspect methods, the algorithm just looks through the binary
 * search tree until the correct element is found. As it is not balanced this
 * means that the best case for the searching of an element is O(log n). Again,
 * because this is not balanced, this means that the worst case would be O(n) as
 * all elements could be to the right/left of each other.
 * </p>
 * 
 * 
 * <b>Add Method</b>
 * <p>
 * The add method is very simple. It simple loops through going left or right
 * (if the root has been set) until it finds a null node. This means that the
 * best case would be if each node had the same amount of children as the other
 * nodes on that level. The worst case being if all the children are going
 * left/right. This means that the best case would be O(log n) and the worst
 * case would be O(n).
 * </p>
 * 
 * 
 * <b>Get Least and Most Methods</b>
 * <p>
 * The get methods are also very simple. It loops through the binary search tree
 * looking for the smallest or the greatest element in the data structure. If
 * there if the element has no children it will remove it. If not it will remove
 * the element and then bubble up the children. This means the worst case would
 * be if all the children were on one side of the parent and no node had two
 * children, essentially a linked list, this would make it O(n). If the binary
 * search tree was sorted with the least "height"/"levels" then this would be
 * the best case, and then the element has no children so it doesn't need to
 * bubble up, this would make the complexity O(log n).
 * 
 * </p>
 * 
 * 
 * <b>Is Empty Method</b>
 * <p>
 *  
 * </p>
 *
 * 
 * </p>
 * 
 * <b>Self assessment:</b>
 * <p>
 * Overall I think I am very happy with the code I have produced and the
 * efficiency for the solution of the problem. I was very happy I have been able
 * to implement a binary search tree, as I thought it would be too difficult for
 * me with my knowledge of java. Once I set up the node class I found it very
 * easy to implement.
 * 
 * 
 * </p>
 *
 * @author Robert Mouncer - rdm10
 * @version 1.0
 * 
 */
public class Rdm10DEPQ implements DEPQ {

	/**
	 * These are used as the global variables for the DEPQ.
	 * 
	 * @param root
	 *            is used to store the variables of the very top node of the
	 *            binary search tree. This is so I can set the current node to
	 *            root and easily start at the top of the tree.
	 * @param size
	 *            is used to keep track of the size of the binary search tree.
	 *            It is changed when a node is added or removed.
	 * @param current
	 *            is used to cycle through all the nodes until the correct one
	 *            is found.
	 * @param tempParent
	 *            is used to temporary store data of the current node before it
	 *            goes onto a null node and loses where it is. This can then be
	 *            used to set the parent of the node to tempParent, and then set
	 *            the left/right child to tempParent.
	 * @param tempNode
	 *            is used to temporary store data of a node when it is being
	 *            removed and other nodes need to bubble up and take the node
	 *            being removed place.
	 *
	 */
	// GLOBAL VARIABLES
	// root - used to store top node
	// size - size of BST
	// current - current node within loops
	// tempParent - used to temporary store nodes for parents
	// tempNode - used to temporary store nodes for deletion and bubbling up
	// other nodes
	Node root;
	int size;
	Node current;
	Node tempParent;
	Node tempNode;

	/**
	 * This method will return the smallest element within the DEPQ but will not
	 * remove it from the DEPQ.
	 *
	 * @return current.getData() - the element of current. Which will be the
	 *         smallest in the DEPQ.
	 */
	public Comparable inspectLeast() {
		// 1. Set current to root.
		current = root;
		// 2.while the node to the left isn't null continue to go left and save
		// it as current.
		while (!(current.getLeft() == null)) {
			current = current.getLeft();
		}
		// 3.return the data of the current node.
		return (current.getData());
	}

	/**
	 * This method will return the largest element within the DEPQ but will not
	 * remove it from the DEPQ.
	 * 
	 * @return current.getData() - the element of current. Which will be the
	 *         largest in the DEPQ.
	 */

	public Comparable inspectMost() {
		// 1. set current to root
		current = root;
		// 2.while the node to the right isn't null continue to go left and save
		// it as current.
		while (!(current.getRight() == null)) {
			current = current.getRight();
		}
		// 3.return the data of the current node
		return (current.getData());
	}

	/**
	 * Adds an element to the DEPQ. The method will firstly check whether there
	 * is a root node present. If there isn't a root node will be created, but
	 * if there is then it will continue to go to the left or right child until
	 * a null node is found. Then it will create that as a new node. I used the
	 * website in the references to help me work out the algorithm needed. The
	 * only help I needed for it was for part 5a and 6a (as seen in the
	 * comments)
	 * 
	 * @param c
	 *            is used to pass the element into the method. It is then added
	 *            to the the DEPQ within the BST.
	 * 
	 */
	public void add(Comparable c) {
		// 1. set the boolean to false and increase the size of the amount of
		// data in the tree.
		boolean set = false;
		size++;

		// 2. if there is no root then create one
		if (root == null) {
			root = new Node(c);
			set = true;
		} else {
			// 3. set the current to root
			current = root;

			do {
				// 4. use tempParent as a temporary store location.
				tempParent = current;

				// 5. if the comparable is less than the data in the current
				// node go left.
				if (c.compareTo(current.getData()) < 0) {

					current = current.getLeft();
					// 5a. if the node is null, create a new node and add it to
					// the tree.
					if (current == null) {
						tempParent.left = new Node(c);
						tempParent.left.parent = tempParent;
						set = true;
					}

					// 6. if the comparable is more than the data in the current
					// node go right
				} else if (c.compareTo(current.getData()) > 0) {

					current = current.getRight();
					// 6a. if the node is null, create a new node and add it to
					// the tree.
					if (current == null) {
						tempParent.right = new Node(c);
						tempParent.right.parent = tempParent;
						set = true;
					}
					// 7. if the comparable is the same as the current node then
					// increase the nodeSize
				} else if (c.compareTo(current.getData()) == 0) {
					current.setNodeSize(current.nodeSize + 1);
					set = true;
				}
				// 8. Once the node has been saved in the tree it will set 'set'
				// to true and exit the while loop.
			} while (!set);
		}
	}

	/**
	 * Removes the smallest element from the DEPQ.
	 * 
	 * @return tempData this is a comparable that the data is stored in. This is
	 *         used as the node may need to be removed.
	 */
	public Comparable getLeast() {
		// 1. decrease the int stored to quickly access the size of the DEPQ.
		size--;
		// tempData is used to store the data once the node has been deleted.
		Comparable tempData = 0;
		// 2. set current to the top node being root
		current = root;

		// 3.while the next node is not equal to null keep going to the left
		// child
		while (!(current.getLeft() == null)) {
			current = current.getLeft();
		}

		// 4.if the nodeSize is greater than 1 then then the node doesn't need
		// to be deleted but the nodeSize just needs to be decreased.
		if (current.getNodeSize() > 1) {

			current.nodeSize--;
			tempData = current.getData();
			// 5. if the node is the root then the root needs to go to the next
			// node to the right, and orphan the original parent.
		} else if (current == root) {

			tempData = root.getData();

			root = root.getRight();

			// 6.if the current node has no right children then save the data
			// and set the node to null
			// I tried using 'current = null' but this would cause a
			// NULLPointerException.
		} else if (current.getRight() == null) {
			tempData = current.getData();
			current.getParent().setLeft(null);
			// 7. if the lowest element does have right children then these need
			// to bubble up.
		} else if (current.getRight() != null) {

			tempData = current.getData();
			tempNode = current;
			current = current.getParent();
			current.setLeft(tempNode.getRight());
			current = tempNode.getRight();
			current.setParent(tempNode.getParent());

		}

		return tempData;
	}

	/**
	 * Removes the largest element from the DEPQ.
	 * 
	 * @return tempData this is a comparable that the data is stored in. This is
	 *         used as the node may need to be removed.
	 */
	public Comparable getMost() {
		// 1. decrease the int stored to quickly access the size of the DEPQ.
		size--;
		Comparable tempData = 0;

		// 2. set current to the top node being root
		current = root;

		// 3.while the next node is not equal to null keep going to the right
		// child
		while (!(current.getRight() == null)) {
			current = current.getRight();
		}

		// 4.if the nodeSize is greater than 1 then then the node doesn't need
		// to be deleted but the nodeSize just needs to be decreased.
		if (current.getNodeSize() > 1) {
			current.nodeSize--;
			tempData = current.getData();
			// 5. if the node is the root then the root needs to go to the next
			// node to the left, and orphan the original parent.
		} else if (current == root) {

			tempData = root.getData();
			root = root.getLeft();

			// 6.if the current node has no left children then save the data and
			// set the node to null
			// I tried using 'current = null' but this would cause a
			// NULLPointerException.
		} else if (current.getLeft() == null) {
			tempData = current.getData();
			current.getParent().setRight(null);

			// 7. if the lowest element does have left children then these need
			// to bubble up.
		} else if (current.left != null) {

			tempData = current.getData();
			tempNode = current;
			current = current.getParent();
			current.setRight(tempNode.getLeft());
			current = tempNode.getLeft();
			current.setParent(tempNode.getParent());

		}
		return tempData;
	}

	/**
	 * Checks if the DEPQ is empty.
	 * 
	 * @return (size==0) - returns true or false.
	 */
	public boolean isEmpty() {
		// return true if size is equal to 0, else return false.
		return (size == 0);
	}

	/**
	 * returns the size of the DEPQ
	 * 
	 * @return size - is the size of the DEPQ.
	 */
	public int size() {
		// return the size of the binary search tree.
		return size;
	}

	// ___________________________________________NODE
	// METHODS____________________________________________
	// Inner object class to be used for nodes within the BST.
	/**
	 * 
	 * This is the inner class I used for the creation of the object Node. I
	 * created it once I realised how I needed to use the nodes in the binary
	 * search tree to store and retrieve data. </p>
	 * 
	 * @author Robert Mouncer - rdm10
	 * @version 1.0
	 * 
	 *
	 */
	/**
	 * @author Robert
	 *
	 */
	private class Node implements Comparable<Node> {
		// instance variables for the Node class
		// data - data within the node
		// parent - parent node to easily navigate
		// left or right - child node
		// nodeSize - store the amount of times the data has been entered
		private Comparable data;
		private Node parent;
		private Node left;
		private Node right;
		private int nodeSize;

		// variables used for the node object.
		/**
		 * This is the constructor for how nodes are created. The only variable
		 * needed is the data, as when new nodes are created, the they will be
		 * at the bottom of the tree so the left/right children just need to be
		 * null.
		 * 
		 * @param data
		 *            the element stored within the node. This decides where the
		 *            element is stored on the tree too.
		 */
		public Node(Comparable data) {
			this.data = data;
			parent = null;
			left = null;
			right = null;
			nodeSize = 1;
		}

		// ___________BELOW IS GETTERS AND SETTERS FOR NODE CLASS______
		/**
		 * A method to return the node size
		 * 
		 * @return The size of the node specified.
		 */
		public int getNodeSize() {
			return nodeSize;
		}

		/**
		 * A method that sets the size of the node within the binary search
		 * tree.
		 * 
		 * @param nodeSize
		 *            the size of the node specified.
		 */
		public void setNodeSize(int nodeSize) {
			this.nodeSize = nodeSize;
		}

		/**
		 * A method that returns the element of the node.
		 * 
		 * @return The element of the node.
		 */
		public Comparable getData() {
			return data;
		}

		/**
		 * A method that returns the parent node.
		 * 
		 * @return The parent node of the current node.
		 */
		public Node getParent() {
			return parent;
		}

		/**
		 * A method that sets the parent node of the node.
		 * 
		 * @param parent
		 *            of the node.
		 */
		public void setParent(Node parent) {
			this.parent = parent;
		}

		/**
		 * A method that will return the left child of the current node.
		 * 
		 * @return The left child of the node.
		 */
		public Node getLeft() {
			return left;
		}

		/**
		 * A method that sets the left child of the node.
		 * 
		 * @param left
		 *            is the left child of the node.
		 */
		public void setLeft(Node left) {
			this.left = left;
		}

		/**
		 * A method that will return the right child of the current node.
		 * 
		 * @return The right child of the node.
		 */
		public Node getRight() {
			return right;
		}

		/**
		 * A method that sets the left child of the node.
		 * 
		 * @param right
		 *            is the right child of the node.
		 */
		public void setRight(Node right) {
			this.right = right;
		}

		/**
		 * @param o
		 *            is the comparable that is being used to compare two
		 *            variables.
		 * @return <ul>
		 *         <li>-1 - less than</li>
		 *         <li>0 - equal to</li>
		 *         <li>1 - greater than</li>
		 *         </ul>
		 */
		public int compareTo(Node o) {
			return 0;
		}

	}

}
