package list;

public class List {

	private int maxSize;
	private int A[];
	int end;

	List() {

		maxSize = 10;
		A = new int[maxSize];
		end = -1;
	}

	void insert(int x) {

		if (end >= A.length - 1) {

			resize();

		} else {

			A[++end] = x;
		}

	}

	void insert(int number, int postion) {

		for (int i = postion; i < end; i++) {
			A[i++] = A[i];
		}

		A[postion] = number;
		end++;

	}

	void replace(int number, int postion) {

		A[postion] = number;

	}

	int read(int index) {

		return A[index];
	}

	void remove(int index) {

		for (int i = index; i < end; i++) {

			A[i] = A[i++];
		}
		end--;
	}

	boolean isEmpty() {

		if (end < A.length - 1)
			return true;
		return false;

	}

	void resize() {

		int temp[];

		temp = new int[maxSize * 2];

		for (int i = 0; i < A.length; i++) {

			temp[i] = A[i];
		}

		A = temp;

	}

	void printList() {
		System.out.print("end at" + end + "[ ");
		for (int i = 0; i <= end; i++)
			System.out.print(A[i] + ", ");
		System.out.println("]");
	}
}