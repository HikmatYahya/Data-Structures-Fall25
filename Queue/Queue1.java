package queue;

public class Queue1 {
	
    private static final int MAX_SIZE = 10; 
    private int[] queueArray;
    private int size;

    public Queue1() {
        queueArray = new int[MAX_SIZE];
        size = 0;
    }

    public void enqueue(int item) {
        if (size == MAX_SIZE) {
            System.out.println("Queue is full. Resize not supported.");
            return;
        }
        // Add item at the next available position (which is size)
        queueArray[size++] = item;
    }

    // Dequeue operation: Remove and return the element from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1; // Or throw an exception
        }

        int removedItem = queueArray[0];

        // Shift all elements to the left to fill the gap left by the removed item
        for (int i = 0; i < size - 1; i++) {
            queueArray[i] = queueArray[i + 1];
        }

        // Reset the last element (optional, just to be clean)
        queueArray[size - 1] = 0;

        // Decrease size after removal
        size--;

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
        return queueArray[0];
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
