package concepts.linkedList;

public class Manager
{

    public static void main(String[] arg)
    {
	LinkList list = new LinkList();

	list.insertAtTail(10);
	list.insertAtTail(20);
	list.insertAtTail(30);
	list.insertAtTail(40);

	System.out.println();
	System.out.println(list.sizeOfLinkList());
	list.pringLinkList();

	list.insertAtHead(5);

	list.insertAfterNode(list.getHead(), 100);

	System.out.println();
	System.out.println(list.sizeOfLinkList());
	list.pringLinkList();

	list.deleteHead();

	System.out.println();
	System.out.println(list.sizeOfLinkList());
	list.pringLinkList();

	list.deleteTail();

	System.out.println();
	System.out.println(list.sizeOfLinkList());
	list.pringLinkList();
    }

}
