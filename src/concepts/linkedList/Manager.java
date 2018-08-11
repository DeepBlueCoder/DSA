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
	list.insertAtTail(50);
	list.insertAtTail(60);

	System.out.println();
	System.out.println(list.sizeOfLinkList());
	list.pringLinkList();
	System.out.println();

//	list.insertAtHead(5);

	/*list.insertAfterNode(list.getHead(), 100);

	System.out.println();
	System.out.println(list.sizeOfLinkList());
	list.pringLinkList();*/

	/*list.deleteHead();

	System.out.println();
	System.out.println(list.sizeOfLinkList());
	list.pringLinkList();*/
	
	/*list.deleteTail();
	
	System.out.println();
	System.out.println(list.sizeOfLinkList());
	list.pringLinkList();*/
	
//	list.nthNodeFromEnd(3);
	
	list.middleElement();
    }

}
