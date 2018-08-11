package concepts.stack;

import concepts.linkedList.LinkedList;

public class Stack
{
	LinkedList list;
	
	public Stack()
	{
		list = new LinkedList();
	}

	public void pop()
	{
		if (list.getHead() != null)
			list.setHead(list.getHead().getNext());
		else
			throw new IllegalStateException("NO Record Found");
	}

	public void push(int data)
	{
		list.insertAtHead(data);
	}

	public int peek()
	{
		if (list.getHead() != null)
			return list.getHead().getData();
		else
			return -1;
	}
}
