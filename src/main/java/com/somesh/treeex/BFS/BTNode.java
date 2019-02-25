/**
 * 
 */
package com.somesh.treeex.BFS;

/**
 * @author ksomalin
 *
 */
public class BTNode {

	BTNode left;
	BTNode right;

	int data;

	public BTNode() {
	}

	public BTNode(int data) {
		this.data = data;
	}

	/**
	 * @return the left
	 */
	public BTNode getLeft() {
		return left;
	}

	/**
	 * @param left
	 *            the left to set
	 */
	public void setLeft(BTNode left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public BTNode getRight() {
		return right;
	}

	/**
	 * @param right
	 *            the right to set
	 */
	public void setRight(BTNode right) {
		this.right = right;
	}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

}
