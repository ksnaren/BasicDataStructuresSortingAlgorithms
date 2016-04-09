package StacksQueuesDeques;

public class StackSingleLinkedList<E> 
{
			stackNode<E> head,temp;
			int size;
			
			public StackSingleLinkedList()
			{
				head=null;
				size=0;
			}
			
			public boolean isEmpty()
			{
				return size==0;
			}
			
			public int size()
			{
				return size;
			}
			
			public E top()
			{
				return head.element;
			}
			
			public void push(E e)
			{
				temp=new stackNode<>();
				if(size==0)
				{
					head=temp;
					head.next=null;
					head.element=e;
					size++;
				}
				else
				{
				temp.next=head;
				temp.element=e;
				head=temp;
				size++;
				}
			}
			
			public E pop()
			{
				size=size-1;
				head=head.next;
				return head.element;

			}
}
