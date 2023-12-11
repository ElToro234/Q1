package Q1;
import java.util.Queue;

public class main {

	public static void main(String[] args) {
		methods q = new methods(6);
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.isEmpty();
		System.out.println("================");
		q.dequeue();
		
	

	}

}
