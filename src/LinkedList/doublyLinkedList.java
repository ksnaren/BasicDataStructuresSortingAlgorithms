package LinkedList;

public class doublyLinkedList<E>
{
	nodeDLL<E> header,trailer,newest;
	int size;
	public doublyLinkedList()
	{
		header=trailer=newest=null;
		size=0;
		header= new nodeDLL<> ();
		trailer= new nodeDLL<> ();
	}
	public int size()
	{
		return size;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	public E first()
	{
		return header.next.element;
	}
	public E last()
	{
		return trailer.prev.element;
	}
	public void addFirst(E e)
	{
		if(size==0)
		{
			newest=new nodeDLL<> ();
			header.next=newest;
			trailer.prev=newest;
			newest.element=e;
			newest.next=trailer;
			newest.prev=header;
			size++;
		}
		else
		{
			newest= new nodeDLL<> ();
			newest.element=e;
			newest.next=header.next;
			newest.prev=header;
			header.next=newest;
			size++;
		}
	}
	public void addLast(E e)
	{
		if(size==0)
		{
			newest=new nodeDLL<> ();
			header.next=newest;
			trailer.prev=newest;
			newest.element=e;
			newest.next=trailer;
			newest.prev=header;
			size++;
		}
		else
		{
			newest= new nodeDLL<> ();
			newest.element=e;
			newest.next=trailer;
			newest.prev=trailer.prev;
			trailer.prev=newest;
			size++;
		}
	}
	public void removeFirst()
	{
		if(size==0)
		{
			System.out.println("Sorry, Cannot delete the linked list as it is empty");
		}
		else
		{
			header.next.next.prev=header;
			header.next=header.next.next;
			size--;
		}
	}
	public void removeLast()
	{
		if(size==0)
		{
			System.out.println("Sorry, Cannot delete the linked list as it is empty");
		}
		else
		{
			trailer.prev.prev.next=trailer;
			trailer.prev=trailer.prev.prev;
			size--;
		}
	}
}
