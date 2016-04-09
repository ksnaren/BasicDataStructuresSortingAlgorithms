package LinkedList;

public class circularLinkedListMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		circularLinkedList<String> sll = new circularLinkedList();
		System.out.println(sll.isempty());
		
		sll.addLast("Naren");
		sll.addLast("Karan");
		sll.addLast("Srujan");
		sll.addLast("Sudeep");
		
		System.out.println(sll.first());
		System.out.println(sll.last());
		
		System.out.println(sll.isempty());
		System.out.println(sll.size);
		sll.rotate();
		System.out.println(sll.first());
		System.out.println(sll.last());
		

		sll.removeFirst();
		System.out.println(sll.first());
		System.out.println(sll.last());
		System.out.println(sll.size);
			
	}
	
}

