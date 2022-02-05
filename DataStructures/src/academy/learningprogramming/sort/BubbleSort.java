package academy.learningprogramming.sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray={20,35,-15,7,55,1,-22};
		
		for(int lastUnsortedIndex=intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--) {
			 for(int i=0 ;i<lastUnsortedIndex;i++) {
				 if(intArray[i]>intArray[i+1]) {
					 swap(intArray,i,i+1);
				 }
			 }
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
