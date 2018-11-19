/**
 * 
 */
package com.somesh.datastructure;

/**
 * @author ksomalin
 *
 */
public class MyStack<T> {

	private static class StackNode<T> {
		T data;
		StackNode<T> next;

		public StackNode(T data) {
			this.data = data;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("StackNode [data=");
			builder.append(data);
			builder.append(", next=");
			builder.append(next);
			builder.append("]");
			return builder.toString();
		}

	}

	private StackNode<T> top;

	// push(item) - will add an item to the top.
	// pop - will return and delete top item.
	// peek - will return top item
	// isEmpty - will return true if the stack is empty.

	public void push(T item) {
		final StackNode<T> t = new StackNode<>(item);
		t.next = top;
		top = t;
		System.out.println(top.toString());
	}

	public T pop() {
		if (top == null)
			throw new NullPointerException();
		T item = top.data;
		top = top.next;
		return item;
	}

	public T peek() {
		if (top == null)
			throw new NullPointerException();

		return top.data;
	}

	public boolean isEmpty() {
		return (top == null);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyStack m = new MyStack();
		m.push("item0");
		m.push("item1");
		m.push("item2");
		m.push("item3");
		m.push("item4");

		System.out.println("PEEK" + m.peek());
		System.out.println(m.pop());
		System.out.println(m.pop());
		System.out.println(m.pop());
		System.out.println(m.pop());
		System.out.println(m.pop());

	}

}
