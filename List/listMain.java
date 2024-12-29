package list;

public class listMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List myList = new List();

		myList.insert(0);
		myList.insert(7);
		myList.insert(8);
		myList.insert(3);

		myList.insert(99);
		myList.insert(99);

		myList.insert(1);
		myList.insert(7);
		myList.insert(8);
		myList.insert(3);
		myList.remove(1);

		// myList.replace(1, 1);

		myList.printList();

	}

}
