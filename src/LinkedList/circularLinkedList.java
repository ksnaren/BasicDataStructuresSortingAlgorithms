package LinkedList;

public class circularLinkedList<E>
{
	node<E> tail,newest;
	int size;
	public circularLinkedList()
	{
		tail=newest=null;
		size=0;
	}
	public boolean isempty()
	{
		return size==0;
	}
	public E first()
	{
		newest=tail.next;
		return newest.element;
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
			tail=new node<> ();
			tail.element=e;
			tail.next=tail;
			size=size+1;
		}
		else
		{
			newest=new node<> ();
			newest.element=e;
			newest.next=tail.next;
			tail.next=newest;
			tail=newest;
			size=size+1;
		}
	}	
	public void rotate()
	{
		tail=tail.next;
	}
	public void removeFirst()
	{
		tail.next=tail.next.next;
		size--;
	}
}
