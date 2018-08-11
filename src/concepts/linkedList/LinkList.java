package concepts.linkedList;

public class LinkList
{
    private Node head;

    public Node getHead()
    {
	return head;
    }

    public int sizeOfLinkList()
    {
	int size = 0;
	Node temp = this.head;
	while (temp != null)
	{
	    size++;
	    temp = temp.next;
	}
	return size;
    }

    public void pringLinkList()
    {
	Node temp = this.head;

	while (temp != null)
	{
	    System.out.println(temp.data);
	    temp = temp.next;
	}
    }

    public void insertAtHead(int data)
    {
	Node newLink = new Node(data);
	newLink.next = this.head;

	this.head = newLink;

    }

    public void insertAtTail(int data)
    {
	Node temp = head;

	Node newLink = new Node(data);

	if (temp != null)
	{
	    while (temp.next != null)
		temp = temp.next;

	    temp.next = newLink;

	} else
	    head = newLink;
    }

    public void insertAfterNode(Node node, int data)
    {
	Node temp = this.head;
	Node newNode = new Node(data);

	while (temp.next != null)
	{
	    if (temp == node)
	    {
		newNode.next = temp.next;
		node.next = newNode;
		break;
	    }

	}
    }

    public void deleteHead()
    {
	this.head = this.head.next;
    }

    public void deleteTail()
    {
	Node temp = this.head;

	while (temp.next.next != null)
	{
	    temp = temp.next;
	}

	temp.next = null;

    }

    // Test comment
    public void deleteElement(Node node)
    {
	Node temp = this.head;
	
	
    }

}
