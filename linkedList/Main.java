package linkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList myLinkedList = new LinkedList();

		myLinkedList.addHead(10);
		myLinkedList.addLast(20);
		myLinkedList.addLast(30);
		myLinkedList.addLast(40);
		System.out.println("Print the Linked List");
		myLinkedList.printList(); // Print the Linked List

		myLinkedList.addHead(5);
		System.out.println("My List after I added new head");
		myLinkedList.printList(); // Print it after I added new head

		myLinkedList.addLast(45);
		System.out.println("My List after I added new item/node");
		myLinkedList.printList(); // Print it after I removed last item/node

		myLinkedList.removeFirst();
		System.out.println("My List after I removed the head");
		myLinkedList.printList(); // Print it after I added new head

		myLinkedList.removeLast();
		System.out.println("My List after I removed last item/node");
		myLinkedList.printList(); // Print it after I removed last item/node

		myLinkedList.deleteAtspecficIndex(1);
		System.out.println("My List after I removed item/node at index 1");
		myLinkedList.printList();

	}

}