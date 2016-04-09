package QuickSort;

public class quickSortMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int [] a= {5,3,4,7,9,1};
		quickSort q = new quickSort();
		q.quickSort1(a,0,5);
		for(int i:a)
		{
			System.out.print(i+" ");
		}

	}

}
