package academy.learningprogramming.hashtables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Challenge2Main {

    public static void main(String[] args) {

        LinkedList<Challenge2Employee> employees = new LinkedList<>();
        employees.add(new Challenge2Employee("Jane", "Jones", 123));
        employees.add(new Challenge2Employee("John", "Doe", 5678));
        employees.add(new Challenge2Employee("Mike", "Wilson", 45));
        employees.add(new Challenge2Employee("Mary", "Smith", 5555));
        employees.add(new Challenge2Employee("John", "Doe", 5678));
        employees.add(new Challenge2Employee("Bill", "End", 3948));
        employees.add(new Challenge2Employee("Jane", "Jones", 123));

        employees.forEach(e -> System.out.println(e));

//        HashMap<Integer, Challenge2Employee> employeeTable = new HashMap<>();
//        ListIterator<Challenge2Employee> iterator = employees.listIterator();
//        List<Challenge2Employee> remove = new ArrayList<>();
//
//        while (iterator.hasNext()) {
//            Challenge2Employee employee = iterator.next();
//            if (employeeTable.containsKey(employee.getId())) {
//                remove.add(employee);
//            }
//            else {
//                employeeTable.put(employee.getId(), employee);
//            }
//        }
//
//        for (Challenge2Employee employee: remove) {
//            employees.remove(employee);
//        }

//        System.out.println("-------------------------");
//        employees.forEach(e -> System.out.println(e));

        HashMap<Integer, Challenge2Employee> employeeTable = new HashMap<>();
        ListIterator<Challenge2Employee> iterator = employees.listIterator();
        List<Challenge2Employee> remove = new ArrayList<>();

        while ( iterator.hasNext()){
            Challenge2Employee employee = iterator.next();
            if(employeeTable.containsKey(employee.getId())){
                remove.add(employee);
            }
            else{
                employeeTable.put(employee.getId(),employee);
            }
        }

        for (Challenge2Employee employee: remove){
            employees.remove(employee);
        }

        System.out.println("---------------------------");
        employees.forEach(e -> System.out.println(e));

//        int[] nums = new int[10];
//        int[] numsToAdd = { 59382, 43, 6894, 500, 99, -58 };
//        for (int i = 0; i < numsToAdd.length; i++) {
//            nums[hash(numsToAdd[i])] = numsToAdd[i];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
    }

    public static int hash(int value) {
        return Math.abs(value % 10);
    }
}
