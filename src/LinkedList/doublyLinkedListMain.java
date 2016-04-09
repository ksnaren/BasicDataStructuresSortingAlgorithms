package LinkedList;

public class doublyLinkedListMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		doublyLinkedList<String> dll = new doublyLinkedList<> ();
		dll.addFirst("Naren");
		dll.addFirst("USA");
		dll.addFirst("Pacific");
		dll.addFirst("Rome");
		dll.removeFirst();
		dll.removeFirst();
		dll.removeFirst();
		dll.removeFirst();
		dll.removeFirst();
		dll.removeFirst();
		
	}

}
