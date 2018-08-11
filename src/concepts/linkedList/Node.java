package concepts.linkedList;

public class Node
{
	Node next;
	int data;

	public Node(int num)
	{
		this.data = num;
		this.next = null;
	}

	public Node getNext()
	{
		return next;
	}

	public int getData()
	{
		return data;
	}

	public void setNext(Node next)
	{
		this.next = next;
	}

	public void setData(int data)
	{
		this.data = data;
	}

}
