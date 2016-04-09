package Trees;
import java.util.*;

public class binarySearchTree<E> 
{
	int size;
	bstNode<E> root,newest;
	ArrayList<E> inOrdTrav=new ArrayList<>();
	public binarySearchTree()
	{
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
	public void search(E e)
	{
		searchNew(e,root);
	}
	public void searchNew(E e, bstNode<E> node)
	{
		if (node.element==e)
		{
			System.out.println("Element found in the tree");
			return;
		}
		else if((int)e>(int)node.element)
		{
			if(node.right==null)
			{
				System.out.println("Element not found in the tree");
			}
			else
			{
			searchNew(e,node.right);
			}
		}
		else if((int)e<(int)node.element)
		{
			if(node.left==null)
			{
				System.out.println("Element not found in the tree");
			}
			else
			{
			searchNew(e,node.left);
			}
		}
		
	}
	public void insert(E e)
	{
		newest=new bstNode<>(e);
		if(size==0)
		{
			root=newest;
			size++;
		}
		else
		{
			insertNew(newest,root);
		}
	}
	public void insertNew(bstNode<E> newest,bstNode<E> root)
	{
		if((int)newest.element<(int)root.element)
		{
			if(root.left==null)
			{
				root.left=newest;
				size++;
			}
			else 
			{
				insertNew(newest,root.left);
			}
			
		}
		else if((int)newest.element>(int)root.element)
		{
			if(root.right==null)
			{
				root.right=newest;
				size++;
			}
			else
			{
				insertNew(newest,root.right);
			}
		}
	}
	public void traversal()
	{
		inOrderTraversal(root);
	}
	public void inOrderTraversal(bstNode<E> root)
	{
		if(root==null)
		{
			return;
		}
		inOrderTraversal(root.left);
		inOrdTrav.add(root.element);
		inOrderTraversal(root.right);
	}
	public void printTraversal()
	{
		for(E i:inOrdTrav)
		{
			System.out.println(i);
		}
	}
	public void delete(E e)
	{
		deleteNew(e,root);
	}
	public bstNode deleteNew(E e, bstNode<E> node)
	{
		if (node.element==e)
		{
			if(node.left==null && node.right==null)
			{
				node=null;
			}
			else if(node.left!=null && node.right!=null)
			{
				inOrderTraversal(node.left);
				delete((E)inOrdTrav.get(inOrdTrav.size()-1));
				node.element=(E)inOrdTrav.get(inOrdTrav.size()-1);
			}
			else
			{
				if(node.left!=null) 
				{
					node=node.left;
				}
				else if(node.right!=null)
				{
					node=node.right;
				}
			}
			
		}
		else if((int)e>(int)node.element)
		{
			if(node.right==null)
			{
				System.out.println("Element not found in the tree");
			}
			else
			{
			node.right = deleteNew(e,node.right);
			}
		}
		else if((int)e<(int)node.element)
		{
			if(node.left==null)
			{
				System.out.println("Element not found in the tree");
			}
			else
			{
				node.left = deleteNew(e,node.left);
			}
		}
		return node;
	}
	

}
