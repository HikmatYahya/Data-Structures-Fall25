package queue;

public class Queue {
    private static final int INITIAL_SIZE = 10; // Initial size of the queue
    private int[] queueArray;
    private int front;
    private int rear;
    private int size;

    public Queue() {
        queueArray = new int[INITIAL_SIZE];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int item) {
        if (size == queueArray.length) {
            resize(); // Resize if the queue is full
        }
        rear = (rear + 1) % queueArray.length;
        queueArray[rear] = item;
        size++;
    }
    
    
    
    

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1; 
        }
        int removedItem = queueArray[front];
        front = (front + 1) % queueArray.length;
        size--;
        return removedItem;
    }
    
    
    

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1; 
        }
        return queueArray[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    // Resize the queue when it is full
    private void resize() {
        int newSize = queueArray.length * 2; 
        int[] newQueueArray = new int[newSize];

        
        
        for (int i = 0; i < size; i++) {
            newQueueArray[i] = queueArray[(front + i) % queueArray.length];
        }

        front = 0;
        rear = size - 1;
        queueArray = newQueueArray;
        System.out.println("Queue resized to " + newSize);
    }
}
