package academy.learningprogramming.hashtables;

import academy.learningprogramming.list.Employee;

public class ChainedHashTableMain {


    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane","Jones",123);
        Employee johnDoe = new Employee("John","Doe",4567);
        Employee marySmith = new Employee("Mary","Smith",22);
        Employee mikeWilson = new Employee("Mike","Wilson",3245);

         ChainedHashTable ht = new ChainedHashTable();
         ht.put("Jones",janeJones);
         ht.put("Doe",johnDoe);
         ht.put("Wilson",mikeWilson);
         ht.put("Smith",marySmith);

         ht.printHashTable();

//        System.out.println("Retrieve key: Smith value: " + ht.get("Smith"));
//        ht.remove("Doe");
//        ht.remove("Jones");
//        ht.printHashTable();
//        System.out.println("Retrieve key: Smith value: " + ht.get("Smith"));

    }

}
