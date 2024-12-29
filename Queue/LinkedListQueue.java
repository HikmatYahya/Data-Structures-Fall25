package queue;

public class LinkedListQueue {
	private Node front;
	private Node rear;
	private int size;

	public LinkedListQueue() {
		front = null;
		rear = null;
		size = 0;
	}

	public void enqueue(int item) {
		Node newNode = new Node(item);
		if (rear == null) {
			front = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
		size++;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return -1; // Or throw an exception
		}
		int removedItem = front.data;
		front = front.next;
		if (front == null) {
			rear = null;
		}
		size--;
		return removedItem;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return -1; // Or throw an exception
		}
		return front.data;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

}

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}
