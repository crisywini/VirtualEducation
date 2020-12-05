/*
 * 
 */
package model.util;

import java.util.LinkedList;

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
	 * @param value   the value
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
	 * @param current       the current
	 */
	private void doPreorder(LinkedList<T> elements, Node<T> current) {
		if (current != null) {
			elements.add(current.value);
			doPreorder(elements, current.left);
			doPreorder(elements, current.right);
		}
	}

	private void doInOrder(LinkedList<T> elements, Node<T> current) {
		if (current != null) {
			doInOrder(elements, current.left);
			elements.add(current.value);
			doInOrder(elements, current.right);
		}
	}

	/**
	 * Do post order.
	 *
	 * @param stringBuilder the string builder
	 * @param current       the current
	 */
	private void doPostOrder(LinkedList<T> elements, Node<T> current) {
		if (current != null) {
			doPostOrder(elements, current.left);
			doPostOrder(elements, current.right);
			elements.add(current.value);
		}
	}

	public LinkedList<T> getPreOrder() {
		LinkedList<T> elements = new LinkedList<T>();
		doPreorder(elements, this.root);
		return elements;
	}

	public LinkedList<T> getInOrder() {
		LinkedList<T> elements = new LinkedList<T>();
		doInOrder(elements, this.root);
		return elements;
	}

	public LinkedList<T> getPostOrder() {
		LinkedList<T> elements = new LinkedList<T>();
		doPostOrder(elements, this.root);
		return elements;
	}

}
