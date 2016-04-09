package mergeSort;

public class mergeSort 
{
	public void mergeSortNew(int[] array)
	{
		int totalLength,mid,leftLength,rightLength;
		totalLength=array.length;
		if(totalLength<2)
		{
			return;
		}
		mid=totalLength/2;
		leftLength=mid-0;
		rightLength=totalLength-mid;
		int[] leftArray=new int[leftLength];
		int[] rightArray=new int[rightLength];
		for(int i=0;i<leftLength;i++)
		{
			leftArray[i]=array[i];
		}
		for(int i=0;i<rightLength;i++)
		{
			rightArray[i]=array[mid+i];
		}
		mergeSortNew(leftArray);
		mergeSortNew(rightArray);
		merge(leftArray,rightArray,array);
	}
	public void merge(int[] leftArray,int[] rightArray,int[] array)
	{
		int i=0,j=0,k=0;
		while(i<leftArray.length && j<rightArray.length)
		{
			if(leftArray[i]<rightArray[j])
			{
				array[k]=leftArray[i];
				i++;
			}
			else
			{
				array[k]=rightArray[j];
				j++;
			}
			k++;
		}
		while(i<leftArray.length)
		{
			array[k]=leftArray[i];
			i++;
			k++;
		}
		while(j<rightArray.length)
		{
			array[k]=rightArray[j];
			j++;
			k++;
		}
	}
}
