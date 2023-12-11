package Q1;

public class methods {
	 	private static int[] queue;
	    private static int front, rear, size;

	    public methods(int size) {
	        this.size = size;
	        queue = new int[size];
	        front = rear = -1;
	    }

	    public void enqueue(int value) {
	        if(rear < size - 1) {
	            if(front == -1) {
	                front = 0;
	            }
	            queue[++rear] = value;
	        }
	    }

	    public int dequeue() {
	        if(front > rear || front == -1) {
	            return -1; // Queue is empty
	        } else {
	            int value = queue[front];
	            if(front >= rear) { // Reset pointers if the last element is dequeued
	                front = rear = -1;
	            } else {
	                front++;
	            }
	            return value;
	        }
	    }
	    
	    static boolean isEmpty() {
			int i ;
			if(front == rear) {
				System.out.println("My queue is Empty");
				return true;
			}
			for(i=front;i<rear;i++) {
				System.out.print(queue[i] + "   ");
			}
			System.out.println();
			return false;
		}
	    
	    public int peek() {
	        if(front != -1) {
	            return queue[front];
	        }
	        return -1; // Queue is empty
	    }
}
