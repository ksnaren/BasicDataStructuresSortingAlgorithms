package mergeSort;

public class mergeSortMain 
{
	public static void  main(String[] args)
	{
		int[] array={9,8,7,6,5,4,6,3};
		mergeSort ms = new mergeSort();
		ms.mergeSortNew(array);
		for(int i:array)
		{
			System.out.println(i);
		}
	}
	
}
