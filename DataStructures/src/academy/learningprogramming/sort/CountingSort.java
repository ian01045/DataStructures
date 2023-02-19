package academy.learningprogramming.sort;

public class CountingSort {

	public static void main(String[] args) {
		
		int[] intArray = { 2, 5,9, 8, 2, 8, 7, 10, 4, 3};
		
		countingSort(intArray, 1, 10);
		
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
	}
	public static void countingSort(int[] input, int min, int max) {
		int[] countArray = new int[(max - min) + 1];
		
		for (int i = 0; i< input.length; i++) {
			//找到要累計的值在countArray對應的位置做次數加一
			countArray[input[i] - min]++;
		}
		
		int j = 0;
		for (int i = min; i <= max; i++) {
			//looping to retrieve all the elements from countArray, 
			//use while loop to get all occurrence for certain value in countArray
			//如果countArray[i-min]>0代表該數字有出現一次以上，依據該數字出現的次數，把數字放到input array相同次數
			while (countArray[i - min] > 0) {
				//把該數字放到input array
				input[j++] = i;
				//把countArray該數字出現的次數減一，代表已經取出了
				countArray[i - min]--;
			}
		}
	}

	
}
