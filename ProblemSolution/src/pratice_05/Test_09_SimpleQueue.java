package pratice_05;

import java.util.Arrays;

public class Test_09_SimpleQueue {
	int rear = -1, front = -1, MaxSize = 1;
	char queue[];

	public Test_09_SimpleQueue() {   queue=new char[MaxSize];  }
	
	public void add(char data) {
		if (full()) {
			MaxSize=MaxSize*2;
			char[] copy= new char[MaxSize];
			System.arraycopy(queue, 0, copy, 0, queue.length);
			queue=copy;
		}
		queue[++rear] = data;
	}

	public int remove() {
		if (empty())
			throw new RuntimeException("queue empty");
		return queue[++front];
	}

	private boolean full() {
		return rear == MaxSize - 1;
	}

	private boolean empty() {
		return rear == front;
	}

	@Override
	public String toString() {
		return "front=" + front + ", rear=" + rear + ", " + Arrays.toString(queue);
	}
}
