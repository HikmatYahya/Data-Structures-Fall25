package queue;

public class Queue2 {
	private static final int MAX_SIZE = 10;
	private int[] queueArray;
	private int front;
	private int rear;
	private int size;

	public Queue2() {
		queueArray = new int[MAX_SIZE];
		front = 0; // Front pointer starts at index 0
		rear = -1; // Rear pointer starts at index -1 (no elements)
		size = 0;
	}

	public void enqueue(int item) {
		if (size == MAX_SIZE) {
			System.out.println("Queue is full. Resize not supported");
			return;
		}

		rear++;

		queueArray[rear] = item;

		size++;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return -1; 
		}

		int removedItem = queueArray[front];

		front++;

		size--;

		if (isEmpty()) {
			front = 0;
			rear = -1;
		}

		return removedItem;
	}

	// Check if the queue is empty
	public boolean isEmpty() {
		return size == 0;
	}

	// Get the number of elements in the queue
	public int size() {
		return size;
	}

	// Peek operation: Return the front element without removing it
	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return -1; // Or throw an exception
		}
		return queueArray[front];
	}

	// For testing purposes: Display the elements in the queue
	public void displayQueue() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
		} else {
			System.out.print("Queue: ");
			for (int i = 0; i < size; i++) {
				System.out.print(queueArray[i] + " ");
			}
			System.out.println();
		}
	}

}
