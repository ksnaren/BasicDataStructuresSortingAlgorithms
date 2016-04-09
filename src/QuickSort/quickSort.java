package QuickSort;

public class quickSort 
{
	public void quickSort1(int[] a, int start, int end)
	{
		if(start<end)
		{
			int pivotIndex;
			pivotIndex=partition(a,start,end);
			quickSort1(a,start,pivotIndex-1);
			quickSort1(a,pivotIndex+1,end);
		}
		
	}
	public int partition(int[] a,int start, int end)
	{
		int pivotIndex=start;
		int pivot=a[end];
		for(int i=start;i<end;i++)
		{
			if(a[i]<=pivot)
			{
				swap(a,i,pivotIndex);
				pivotIndex=pivotIndex+1;
			}
		}
		swap(a,pivotIndex,end);
		return pivotIndex;
	}
	public void swap(int []a,int p, int q)
	{
		int temp;
		temp=a[p];
		a[p]=a[q];
		a[q]=temp;
	}
}
