package academy.learningprogramming.BinarySearch;

public class Main {

    public static void main(String[] args ){
        int[] intArray = { -22, -15, 1, 7, 20, 35, 55};

//        System.out.println(iterativeBinarySearch(intArray, -15));
//        System.out.println(iterativeBinarySearch(intArray, 35));
//        System.out.println(iterativeBinarySearch(intArray, 8888));
//        System.out.println(iterativeBinarySearch(intArray, 1));
        System.out.println(recursiveBinarySearch(intArray, -15));
        System.out.println(recursiveBinarySearch(intArray, 35));
        System.out.println(recursiveBinarySearch(intArray, 8888));
        System.out.println(recursiveBinarySearch(intArray, 1));

    }

    public static int iterativeBinarySearch(int[] input, int value){
        int start = 0;
        int end = input.length;

        while (start < end){
            int middlePoint = ( start + end ) / 2;
            System.out.println("middlePoint = " + middlePoint);
            if( input[middlePoint] == value ){
                return middlePoint;
            }else if(input[middlePoint] < value){
                start = middlePoint + 1;
            }else{
                end = middlePoint;
            }
        }

        return -1 ;
    }

    public static int recursiveBinarySearch(int[] input, int value){
        int start = 0;
        int end = input.length;
        return recursiveBinarySearch(input,start,end,value);
    }
    public static int recursiveBinarySearch(int[] input, int start, int end, int value){
        if(start >= end){
            return -1;
        }
        int midPoint = ( start + end ) / 2 ;
        System.out.println("midPoint = " + midPoint);
        if(input[midPoint] == value){
            return midPoint;
        }else if(input[midPoint] < value){
            return recursiveBinarySearch(input,midPoint+1,end,value);
        }else{
            return recursiveBinarySearch(input,start,midPoint,value);
        }
    }



}
