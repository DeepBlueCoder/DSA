package concepts.queue;

import concepts.linkedList.LinkedList;

public class Queue
{
	LinkedList list;

	public Queue()
	{
		list = new LinkedList();
	}

	public int peek()
	{
		return list.nthNodeFromEnd(1);
	}

	public void pop()
	{
		list.deleteTail();
	}

	public void push(int data)
	{
		list.insertAtTail(data);
	}
}
