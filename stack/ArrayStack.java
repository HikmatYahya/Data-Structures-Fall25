package stack;

public class ArrayStack {
	private final int MAXSIZE;
	private int[] stackArray;
	private int top;

	public ArrayStack(int size) {
		MAXSIZE = size;
		stackArray = new int[MAXSIZE];
		top = -1;
	}

	public void push(int value) {
		if (top < MAXSIZE - 1) {
			stackArray[++top] = value;
		} else {
			System.out.println("Stack overflow!");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			return stackArray[top--];
		} else {
			System.out.println("Stack is empty!");
			return -1;
		}
	}

	public int peek() {
		if (!isEmpty()) {
			return stackArray[top];
		} else {
			System.out.println("Stack is empty!");
			return -1;
		}
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public int size() {
		return top + 1;
	}
}
