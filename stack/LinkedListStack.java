package stack;

class Node {
	int val;
	Node next;

	Node(int x) {
		val = x;
	}
}

public class LinkedListStack {
	private Node top;

	public LinkedListStack() {
		top = null;
	}

	public void push(int value) {
		Node newNode = new Node(value);
		newNode.next = top;
		top = newNode;
	}

	public int pop() {
		if (!isEmpty()) {
			int value = top.val;
			top = top.next;
			return value;
		} else {
			System.out.println("Stack is empty!");
			return -1;
		}
	}

	public int peek() {
		if (!isEmpty()) {
			return top.val;
		} else {
			System.out.println("Stack is empty!");
			return -1;
		}
	}

	public boolean isEmpty() {
		return (top == null);
	}

	public int size() {
		int count = 0;
		Node current = top;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
}
