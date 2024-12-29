package linkedList;

public class LinkedList {

	private Node head;
	private int size;

	public LinkedList() {
		head = null;
		size = 0;
	}

	public void addHead(int data) {

		if (isEmpty()) {
			head = new Node(data);
		} else {

			Node newNode = new Node(data);

			newNode.next = head;
			head = newNode;
		}
		size++;

	}

	public void addLast(int data) {

		if (isEmpty()) {
			head = new Node(data);
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new Node(data);
			;
		}
		size++;
	}

	public void removeFirst() {

		if (isEmpty()) {
			return;
		} else {
			head = head.next;
		}
		size--;
	}

	public void removeLast() {

		if (isEmpty() && (head.next == null)) {
			head = null;
		} else {

			Node current = head.next;
			while (current.next.next != null) {
				current = current.next;

			}

			current.next = null;
		}
		size--;
	}

	public void deleteAtspecficIndex(int index) {

		if (index == 0) {
			removeFirst();
		} else if (index == size - 1) {
			removeLast();
		} else {

			Node current = head;

			for (int i = 0; i < index; i++) {

				current = current.next;
			}
			current.next = current.next.next;

		}

	}

	public boolean search(int data) {
		Node current = head;
		while (current != null) {
			if (current.id == data) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public void printList() {
		Node current = head;
		System.out.print("List: ");
		while (current != null) {
			System.out.print(current.id + " ");
			current = current.next;
		}
		System.out.println("\n");
	}

	public boolean isEmpty() {

		return head == null;
	}
}

class Node {

	int id;
	String name;
	Node next;

	Node(int id) {

		this.id = id;

		this.next = null;

	}

}