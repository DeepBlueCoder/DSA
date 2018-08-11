package concepts.queue;

public class QueueManager
{

	public static void main(String[] args)
	{
		Queue queue = new Queue();

		queue.push(10);
		queue.push(20);
		queue.push(30);
		queue.push(40);
		queue.push(50);
		queue.push(60);
		queue.push(70);

		System.out.println(queue.peek());

		queue.pop();

		System.out.println(queue.peek());
		
		queue.push(80);
		
		System.out.println(queue.peek());
	}

}
