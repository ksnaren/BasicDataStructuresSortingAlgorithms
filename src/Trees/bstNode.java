package Trees;

public class bstNode<E>
{
		E element;
		bstNode<E> left;
		bstNode<E> right;
		
		public bstNode(E e)
		{
			element=e;
			left=null;
			right=null;
		}
}
