package academy.learningprogramming.sort;

public class QuickSort {

	public static void main(String[] args) {

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22};
		
		quickSort(intArray, 0, intArray.length);
		
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
	}
	
	public static void quickSort(int[] input, int start, int end) {
		if(end-start < 2) {
			return;
		}
		
		int pivotIndex = partition(input, start,end); 
		//quick sort for elements less than pivot point
		quickSort(input, start, pivotIndex);
		
		//quick sort for elements larger than pivot point
		quickSort(input, pivotIndex+1, end);
		
	}

	private static int partition(int[] input, int start, int end) {
		
		//this is using the first element as the pivot
		int pivot = input[start];
		int i = start;
		int j = end;
		
		while (i < j) {
			
			//empty loop body to find the element that less than pivot
			while (i < j && input[--j] >= pivot);
			if (i < j) {
				input[i] = input[j];
			}
			
			//empty loop body to find the element that larger than pivot
			while (i < j && input[++i] <= pivot);
			if (i < j) {
				input[j] = input[i];
			}
		}
		
		input[j] = pivot;
		return j;
	}

}
