package Trees;
public class binaryTreeTraversal
{
     	public static void main(String[] args)
     	{
     		treeNode<Integer> root = new treeNode<>();
     		root.element=1;
     		root.leftChild=new treeNode<>();
     		root.rightChild=new treeNode<>();
     		root.leftChild.element=2;
     		root.rightChild.element=3;
     		root.leftChild.leftChild=new treeNode<>();
     		root.leftChild.rightChild=new treeNode<>();
     		root.leftChild.leftChild.element=4;
     		root.leftChild.rightChild.element=5;
     		preorderTraversal(root);
     		System.out.println("");
     		postorderTraversal(root);
     		System.out.println("");
     		inorderTraversal(root);
     	}
     	public static void preorderTraversal(treeNode<Integer> node)
     	{
     		if(node==null)
     		{
     			return;
     		}
     		System.out.println(node.element);
     		preorderTraversal(node.leftChild);
     		preorderTraversal(node.rightChild);
     	}
     	
     	public static void postorderTraversal(treeNode<Integer> node)
     	{
     		if(node==null)
     		{
     			return;
     		}
     		postorderTraversal(node.leftChild);
     		postorderTraversal(node.rightChild);
     		System.out.println(node.element);
     	}
     	
     	public static void inorderTraversal(treeNode<Integer> node)
     	{
     		if(node==null)
     		{
     			return;
     		}
     		inorderTraversal(node.leftChild);
     		System.out.println(node.element);
     		inorderTraversal(node.rightChild);
     		
     	}
			
            
}
