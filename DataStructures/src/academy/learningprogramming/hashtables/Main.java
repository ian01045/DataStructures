package academy.learningprogramming.hashtables;

import academy.learningprogramming.Queue.CircularArrayQueue;
import academy.learningprogramming.list.Employee;

public class Main {


    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane","Jones",123);
        Employee johnDoe = new Employee("John","Doe",4567);
        Employee marySmith = new Employee("Mary","Smith",22);
        Employee mikeWilson = new Employee("Mike","Wilson",3245);
        Employee billEnd = new Employee("Bill","End",78);

         SimpleHashTable ht = new SimpleHashTable();
         ht.put("Jones",janeJones);
         ht.put("Doe",johnDoe);
         ht.put("Wilson",mikeWilson);
         ht.put("Smith",marySmith);

         ht.printHashTable();

        System.out.println("Retrieve key: Wilson value: " + ht.get("Wilson"));
        System.out.println("Retrieve key: Smith value: " + ht.get("Smith"));
        System.out.println("Retrieve key: Ian value: " + ht.get("Ian"));

        ht.remove("Wilson");
        ht.remove("Jones");
        ht.printHashTable();

        System.out.println("Retrieve key Smith:" + ht.get("Smith"));
    }

}
