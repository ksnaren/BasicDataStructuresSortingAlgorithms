package Trees;

public class binarySearchTreeMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		binarySearchTree<Integer> tree=new binarySearchTree<>();
		//System.out.println(tree.isEmpty());
		tree.insert(44);
		tree.insert(17);
		tree.insert(8);
		tree.insert(88);
		tree.insert(32);
		tree.insert(65);
		tree.insert(97);
		tree.insert(28);
		tree.insert(54);
		tree.insert(82);
		tree.insert(93);
		tree.insert(21);
		tree.insert(29);
		tree.insert(76);
		tree.insert(80);
		//System.out.println(tree.size());
		//tree.search(30);
		//tree.traversal();
		//tree.printTraversal();
		tree.delete(44);
		tree.traversal();
		tree.printTraversal();
	}

}
