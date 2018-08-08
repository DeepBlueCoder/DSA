package concepts.linkedList;

public class MyExperiments_LinkedList
{

    public static void main(String[] args)
    {

    }

}

class Node
{
    Node next;
    String data;

    public Node(Node next, String data)
    {
	this.next = next;
	this.data = data;
    }

    public Node(String data)
    {
	this.next = null;
	this.data = data;
    }

}

class MyLinkedList
{

    public void addAtEnd(Node head, String data)
    {
	Node lastNode = new Node(data);
	
	while(head.next!=null)
	{
	    
	}
    }
}