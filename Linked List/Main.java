package linkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList myList = new LinkedList();

		Node node1 = new Node(1);

		myList.insert(node1);

		Node node2 = new Node(2);
		myList.insert(node2);

		Node node3 = new Node(3);
		myList.insert(node3);

		Node node4 = new Node(4);
		myList.insert(node4);

		// myList.printLinkedList();

		myList.remove(40);

		myList.printLinkedList();

		myList.remove(2);
		myList.remove(4);
		myList.remove(3);

		myList.remove(1);

		// System.out.println(myList.search(3));

		// myList.remove(12);

		 myList.printLinkedList();

	}

}
