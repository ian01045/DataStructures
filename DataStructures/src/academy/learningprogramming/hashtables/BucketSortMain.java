package academy.learningprogramming.hashtables;

import academy.learningprogramming.list.Employee;

import java.util.*;

public class BucketSortMain {


    public static void main(String[] args) {

        int[] intArray = {54, 46, 83, 66, 95, 92, 43};

        bucketSort(intArray);

        for (int i=0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    public static void bucketSort(int[] input){
        List<Integer>[] buckets = new List[10];
        //use array list for each bucket
        for (int i=0; i<buckets.length; i++){
//            buckets[i] = new ArrayList<Integer>();
//            buckets[i] = new LinkedList<Integer>();
            buckets[i] = new Vector<Integer>();
        }

        //scattering each input value into bucket
        for(int i=0; i<input.length; i++){
            buckets[hash(input[i])].add(input[i]);
        }

        //sort each bucket
        for (List bucket : buckets){
            Collections.sort(bucket);
        }

        //concate each bucket
        int j = 0;
        for (int i = 0; i < buckets.length; i++){
            for (int value: buckets[i]){
                input[j++] = value;
            }
        }
    }

    private static int hash(int value){
        return value / (int) 10;
    }

}
