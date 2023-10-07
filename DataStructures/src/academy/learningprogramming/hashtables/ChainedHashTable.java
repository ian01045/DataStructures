package academy.learningprogramming.hashtables;

import academy.learningprogramming.list.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable
{
     private LinkedList<StoredEmployee>[] hashtable;

     public ChainedHashTable() {
         hashtable = new LinkedList[10];
         for (int i = 0; i< hashtable.length; i++){
             hashtable[i] = new LinkedList<StoredEmployee>();
         }
     }

     public void put(String key, Employee employee){
         int hashKey = hashKey(key);
         hashtable[hashKey].add(new StoredEmployee(key,employee));
     }

     public Employee get(String key){
         int hashedKey = hashKey(key);
         ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
         StoredEmployee employee = null;
         while (iterator.hasNext()){
             employee = iterator.next();
             if (employee.key.equals(key)){
                 return employee.employee;
             }
         }

         return null;
     }

    public Employee remove(String key){
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee employee = null;
        int index = 0;
        while (iterator.hasNext()){
            employee = iterator.next();
            if (employee.key.equals(key)){
                break;
            }
            index++;
        }

        //here need to consider 2 situations
        //1. no employee in this hashedKey linkedlist
        //2.part1 traverse all the hashtable, current iterator get last one into employee variable, and this employee's key not match input key
        //2.part2 this means we can't find the employee with the input key that desired to remove so return null
        if (employee == null || !employee.key.equals(key)){
            return null;
        }else{
            hashtable[hashedKey].remove(index);
            return employee.employee;
        }
    }

     private int hashKey(String key){
//         return key.length() % hashtable.length;
         return Math.abs(key.hashCode() % hashtable.length);
     }

     public void printHashTable() {
         for (int i = 0 ; i<hashtable.length; i++){
             if(hashtable[i].isEmpty()){
                 System.out.println("Position " + i + ": empty");
             }else{
                 System.out.print("Position " + i + ": ");
                 ListIterator<StoredEmployee> iterator = hashtable[i].listIterator();
                 while (iterator.hasNext()){
                     System.out.print(iterator.next().employee);
                     System.out.print("->");
                 }
                 System.out.println("null");
             }
         }
     }


}
