package academy.learningprogramming.recursion;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println(iterativeFactorial(3));
		System.out.println(recursiveFactorial(3));
	}
	
	public static int iterativeFactorial(int num) {
		if(num==0) {
			return 1;
		}
	
		int factorial =1; 
		for(int i=1;i<=num;i++) {
		
			factorial*=i;
			
		}
		return factorial;
		
	}

	// 0!=1
	// 1!=1*0!=1*1=1
	// 2!=2*1!=2*1*0!=2*1*1=2
	// 3!=3*2!=3*2*1!=3*2*1*0!=3*2*1*1=6
	public static int recursiveFactorial(int num) {
	
		if(num==0) {
			return 1;
		}
		
		return num*recursiveFactorial(num-1);
	}

}
