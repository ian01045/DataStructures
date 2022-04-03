package academy.learningprogramming.sort;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22};
//		int[] intArray = { 20, 35, -15};
//		int[] intArray = { 32, 34, 33, 36};
//		int[] intArray = { 32, 36, 33, 34};
		
		mergeSort(intArray, 0, intArray.length);
		
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
	}

	//20, 35, -15, 7, 55, 1, -22
	public static void mergeSort(int[] input, int start, int end) {
		if(end -start < 2) {
			return;
		}
		
		int mid = (start + end )/2;
		mergeSort(input, start, mid );
		mergeSort(input, mid, end);
		merge(input, start, mid, end);
		
	}

	//20, 35, -15, 7, 55, 1, -22
	private static void merge(int[] input, int start, int mid, int end) {

		if(input[mid-1] <= input[mid]) {
			return;
		}
		
		int i = start;
		int j = mid;
		int tempIndex = 0;
		
		int[] temp = new int[end-start];
		while (i < mid && j < end) {
			temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
		}
		
		//copy left array left elements back to input array
		System.arraycopy(input, i, input, start+tempIndex, mid-i);
		
		//copy sorted elements in temp array back to input array
		System.arraycopy(temp, 0, input, start, tempIndex);

		
		//less good sln to copy all elements into temp array, still works!	
//		if(j==end) {
//			while(i < mid) {
//				temp[tempIndex++]= input[i++];
//			}
//		}
//		
//		if(i==mid) {
//			while(j < end) {
//				temp[tempIndex++]= input[j++];
//			}
//		}
//		
//		System.arraycopy(temp, 0, input, start, end-start);
		
		
		//right array element left, no need to handle
		//{32,34},{33,36}
		//temp array{32,33,34} right array left{36}
		//final array{32,33,34,36}
		
		
		//left array element left , need put back to temp array
		//{32,36},{33,34}
		//temp array{32,33,34} left array{36}
		//final array{32,33,34,36}
	}
}
