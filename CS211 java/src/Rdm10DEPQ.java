/**
 * <p>
 * This is a Double ended priority queue created for my CS21120 assignment. I
 * implemented it using a binary search tree as the data structure to store all
 * the elements within the DEPQ. There were multiple data structures that I
 * could have used but I decided that I would create a DEPQ using a BST as I
 * thought it would be easy enough to implement. I was unsure to start with how
 * to created the binary search tree, I thought it would have to be stored
 * within an array, but then I realised I could create it as an object that
 * refers to itself for the parent and child nodes.
 * </p>
 * 
 * <p>
 * Firstly I implemented the class Rdm10DEPQ as it would need to use the methods
 * that were created in the DEPQ interface. This is why I have used 'implements
 * DEPQ'. I created the very simple methods first such as "isEmpty()" and
 * "size()" as I knew how these would work and what they would need to return. I
 * then created the node class but I didn't include the nodeSize as I thought
 * this would just pass to the left. But then I found out that it needs to be
 * stored within the node, so I created nodeSize. I then went onto creating the
 * add method, this is where I had most problem because I couldn't get the
 * format of the if and while statements correct, so I looked at the website in
 * the references for help [1]. Once this was done I created the inspect methods
 * and they were easy to create, and are just inverses of each other. This goes
 * the same for the get methods, I used the start of the inspect methods and
 * wrote down pseudo code, and created it. The only thing that I missed out
 * first time was the if the root was the smallest/largest elemenet.
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
 * <li>The DEPQ.java created by Bernie Tidderman.Which is the interface for this
 * class</li>
 * <li>The DEPQTest.java created by Bernie Tidderman which was a JUnit class to
 * test the DEPQ</li>
 * <li>The DEPQStringTest.java created by Bernie Tidderman to test the
 * comparable type being passed through methods.</li>
 * <li>Used to help create the add function, I only needed it for the
 * "if (current == null)" part of the method as I was unsure at the time when I
 * created it. [1] - <a href=
 * "http://algorithms.tutorialhorizon.com/binary-search-tree-complete-implementation/"
 * > Click here to view site </a></li>
 * </ul>
 * </p>
 * 
 * <p>
 * <u><b>References:</b></u>
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
 * <u><b>Complexity Analysis:</b></u>
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
 * As this is just a return statement of a global variable, I believe the time
 * complexity would be O(1).
 * </p>
 * 
 * 
 * <b>Size Method</b>
 * <p>
 * As this is just a return statement of a global variable, I believe the time
 * complexity would be O(1).
 * </p>
 *
 *
 * <b>All getter and setter methods within Node Class</b>
 * <p>
 * As they are just return statements of the variables within nodes, I believe
 * the time complexity would be O(1).
 * </p>
 * 
 * <p>
 * Overall the average efficiency seems to be O(log n) but the worst case seems
 * to be O(n). If I used a different data structure such a sorted array then the
 * average case would be O(n). Another data structure that I could have used
 * would have been a interval heap but that would have had the same complexity
 * as implementing a binary search tree as I have.
 * </p>
 * 
 * </p>
 * 
 * <p>
 * <u><b>Self Evaluation:</b></u>
 * </p>
 * 
 * 
 * 
 * <p>
 * With the marking of the "correct functioning of each method" I think I have
 * achieved at least 20% of the 25% achievable, my code is all working perfectly
 * and passes the tests with no problem. The only down side is that when a root
 * is removed the new root is still linked to the old root but it is ignored
 * from then on.
 * </p>
 * 
 * <p>
 * With marking the "Overall efficiency" I think I have also achieved a good
 * mark, with the average case of most methods being O(log n), this is what was
 * expected from the assignment specification. I think I would give myself 18%
 * of the 25% available.
 * </p>
 * 
 * <p>
 * I think I have given a clear description of my algorithms for my
 * "Documentation based report". I feel that there is plenty of javadoc for each
 * method, there is little javadoc for the smaller methods as there is not much
 * to document about them. For my "Documentation based report" I think I would
 * give myself 20% of the 25% available.
 * </p>
 * 
 * <p>
 * "Complexity Analysis" is definitely not my strongest subject, but I feel
 * after going over Bernie Tidderman and Thomas Jansen slides I feel a lot more
 * comfortable working it out. I have provided the best and worst case for all
 * the methods and I am certain they are right. I have completed the tasks
 * provided in the specification so I would award myself at least 17% of the 20%
 * available.
 * </p>
 * 
 * 
 * <p>
 * My "Self Evaluation" is covers all points necessary as shown in the marking
 * grid of the specification. I would give myself the full 5% available for this
 * section.
 * </p>
 * 
 * <p>
 * Overall I would give myself between 75% and 80%. I think I am very happy with
 * the code I have produced and the efficiency for the solution of the problem.
 * I was very happy I have been able to implement a binary search tree, as I
 * thought it would be too difficult for me with my knowledge of java. Once I
 * set up the node class I found it very easy to implement.
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
	 * remove it from the DEPQ. It will firstly set the current to root. Then
	 * loop through the nodes constantly going left as this is where the lowest
	 * element will be. Once it can't go any further to the left it will return
	 * the element that was in that position.
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
	 * remove it from the DEPQ. It will firstly set the current to root. Then
	 * loop through the nodes constantly going right as this is where the
	 * largest element will be. Once it can't go any further to the right it
	 * will return the element that was in that position.
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
	 * website in the references to help me work out the algorithm needed for
	 * the small parts being "if (current == null)". The only help I needed for
	 * it was for part 5a and 6a (as seen in the comments)
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
	 * Removes the smallest element from the DEPQ and returns the value from the
	 * node. This is done by using the same functions as the inspect methods for
	 * the first part, it will go all the way left. Once it has found the
	 * smallest element it will remove it. If that node has no children then it
	 * will do nothing else other than return the element that was in the node
	 * deleted. But if the node has children that are larger than the smallest
	 * node then it will bubble these up. If the root node is the smallest node
	 * then it will delete the root and save the next largest child node as the
	 * root.
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
	 * Removes the largest element from the DEPQ and returns the value from the
	 * node. This is done by using the same functions as the inspect methods for
	 * the first part, it will go all the way right. Once it has found the
	 * largest element it will remove it. If that node has no children then it
	 * will do nothing else other than return the element that was in the node
	 * deleted. But if the node has children that are smaller than the largest
	 * node then it will bubble these up. If the root node is the largest node
	 * then it will delete the root and save the next smallest child node as the
	 * root.
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
	 * Checks if the DEPQ is empty. If it is empty it will return true,
	 * otherwise it will return false. This is done using the size variable.
	 * 
	 * @return (size==0) - returns true or false.
	 */
	public boolean isEmpty() {
		// return true if size is equal to 0, else return false.
		return (size == 0);
	}

	/**
	 * returns the size of the DEPQ. Size is the variable that holds the amount
	 * of elements within the DEPQ.
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
