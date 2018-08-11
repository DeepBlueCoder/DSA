package concepts.stack;

public class StackManager
{

	public static void main(String[] args)
	{
		Stack st = new Stack();

		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);

		System.out.println(st.peek());
		st.pop();
		System.out.println(st.peek());
		st.push(55);
		System.out.println(st.peek());
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();

	}

}