package academy.learningprogramming.sort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray={20,35,-15,7,55,1,-22};
		
		for(int lastUnsortedIndex=intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--) {

			//largest element position
			int largest=0;
			
			for(int i=1;i<=lastUnsortedIndex;i++) {
				if(intArray[i]>intArray[largest]) {
					largest=i;
				}
			}
			
			swap(intArray,largest,lastUnsortedIndex);
		}
		
		for(int item:intArray){
			System.out.println(item);
		}

	}

	public static void swap(int[] array, int i, int j) {
		int tmp;
//		if(array[i]!=array[j]) {
		
			tmp=array[i];
			array[i]=array[j];
			array[j]=tmp;
//		}
	}
}
