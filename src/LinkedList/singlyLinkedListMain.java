package LinkedList;

public class singlyLinkedListMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		singlyLinkedList<String> sll = new singlyLinkedList();
		System.out.println(sll.isempty());
		
		sll.addLast("Naren");
		sll.addLast("Karan");
		
		System.out.println(sll.first());
		System.out.println(sll.last());
		System.out.println(sll.isempty());
		System.out.println(sll.size);
		
		sll.addLast("Srujan");
		sll.addLast("Sudeep");
		sll.addLast("Sudeep");
		sll.addLast("Sudeep");
		System.out.println(sll.first());
		System.out.println(sll.last());
		System.out.println(sll.isempty());
		System.out.println(sll.size);
		sll.removeFirst();
		System.out.println(sll.first());
		System.out.println(sll.size);
	
	}

}
