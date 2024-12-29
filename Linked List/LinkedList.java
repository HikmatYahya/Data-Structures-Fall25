
package linkedList;

public class LinkedList {

	Node head;

	void insert(Node newNode) {

		if (head == null) {

			head = newNode;

		} else {

			Node current = head;

			while (current.next != null) {

				current = current.next;
			}

			current.next = newNode;

		}

	}

	void printLinkedList() {

		if (head == null) {

			System.out.println("The List is empty");
		} else {

			Node nodeToPrint = head;

			while (nodeToPrint != null) {

				System.out.println(nodeToPrint.id + " ");
				nodeToPrint = nodeToPrint.next;

			}
		}

	}

	void remove(int id) {

		if (head == null) {

			System.out.println("List is NULL cannot remove " + id);
		} else {

			if (head.id == id) {

				head = head.next;

			} else {

				Node previous = head;
				Node currentNode = head.next;

				while (currentNode.next != null) {

					if (currentNode.id == id) {

						previous.next = currentNode.next;
						
					//	previous.next = previous.next.next;

					}

					previous = previous.next;
					currentNode = currentNode.next;

				}

				if (currentNode.id == id) {
					previous.next = null;
					
					
				}

			}
		}

	}

	

	
	
	public boolean search(int id) {

		Node node = head;

		if (node == null) {
			return false;

		} else {

			if (head.id == id) {

				return true;
			} else {

				while (node.next != null) {

					if (node.id == id) {

						return true;
					} else {

						node = node.next;
					}

				}
				return false;
			}
		}
	}

}

class Node {

	int id;
	Node next;

	Node(int id) {

		this.id = id;
		next = null;

	}

}