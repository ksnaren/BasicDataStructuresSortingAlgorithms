package LinkedList;


public class singlyLinkedList<E>
{
	node<E> head,tail,newest;
	int size;
	public singlyLinkedList()
	{
		head=tail=newest=null;
		size=0;
	}
	public boolean isempty()
	{
		return size==0;
	}
	public E first()
	{
		return head.element;
	}
	public E last()
	{
		return tail.element;
	}
	public int size()
	{
		return size;
	}
	public void addLast(E e)
	{
		if (size==0)
		{
			head=new node<> ();
			head.element=e;
			head.next=null;
			tail=head;
			size=size+1;
		}
		else
		{
			newest=new node<> ();
			tail.next=newest;
			newest.element=e;
			newest.next=null;
			tail=newest;
			size=size+1;
		}
	}	
	public void removeFirst()
	{
		head=head.next;
		size=size-1;
	}

}
