/*
 * 
 */
package util;

/**
 * The Class BinaryTree.
 *
 * @param <T> the generic type
 */
public class BinaryTree<T extends Comparable<T>> {

	/** The root. */
	private Node<T> root;

	/**
	 * Instantiates a new binary tree.
	 *
	 * @param value the value
	 */
	public BinaryTree(T value) {
		root = new Node<T>(value);
	}

	/**
	 * Gets the root.
	 *
	 * @return the root
	 */
	public Node<T> getRoot() {
		return root;
	}

	/**
	 * Sets the root.
	 *
	 * @param root the new root
	 */
	public void setRoot(Node<T> root) {
		this.root = root;
	}

	/**
	 * Adds the.
	 *
	 * @param current the current
	 * @param value the value
	 * @return the node
	 */
	private Node<T> add(Node<T> current, T value) {
		
		if (current == null) {
			return new Node<T>(value);
		}
		if (current.value.compareTo(value) == 1) {
			current.left = add(current.left, value);
		} else if (current.value.compareTo(value) == -1) {
			current.right = add(current.right, value);
		}
		return current;
	}

	/**
	 * Adds the.
	 *
	 * @param value the value
	 */
	public void add(T value) {
		add(root, value);
	}

	
	/**
	 * Do preorder.
	 *
	 * @param stringBuilder the string builder
	 * @param current the current
	 */
	private void doPreorder(StringBuilder stringBuilder, Node<T> current) {
		if(current != null) {
			stringBuilder.append(current.value+ ", ");
			doPreorder(stringBuilder, current.left);
			doPreorder(stringBuilder, current.right);
		}
	}
	
	/**
	 * Do in order.
	 *
	 * @param stringBuilder the string builder
	 * @param current the current
	 */
	private void doInOrder(StringBuilder stringBuilder, Node<T> current) {
		if(current != null) {
			doPreorder(stringBuilder, current.left);
			stringBuilder.append(current.value+ ", ");
			doPreorder(stringBuilder, current.right);
		}
	}

	/**
	 * Do post order.
	 *
	 * @param stringBuilder the string builder
	 * @param current the current
	 */
	private void doPostOrder(StringBuilder stringBuilder, Node<T> current) {
		if(current != null) {
			doPreorder(stringBuilder, current.left);
			doPreorder(stringBuilder, current.right);
			stringBuilder.append(current.value+ ", ");
		}
	}
	
	/**
	 * Gets the pre order.
	 *
	 * @return the pre order
	 */
	public String getPreOrder() {
		StringBuilder sb = new StringBuilder();
		doPreorder(sb, this.root);
		return sb.toString();
	}
	
	/**
	 * Gets the in order.
	 *
	 * @return the in order
	 */
	public String getInOrder() {
		StringBuilder sb = new StringBuilder();
		doInOrder(sb, this.root);
		return sb.toString();
	}
	
	/**
	 * Gets the post order.
	 *
	 * @return the post order
	 */
	public String getPostOrder() {
		StringBuilder sb = new StringBuilder();
		doPostOrder(sb, this.root);
		return sb.toString();
	}
}
