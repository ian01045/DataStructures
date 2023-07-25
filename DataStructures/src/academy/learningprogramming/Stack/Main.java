package academy.learningprogramming.Stack;

import academy.learningprogramming.LinkedList.EmployeeLinkedList;
import academy.learningprogramming.list.Employee;

public class Main {


    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane","Jones",123);
        Employee johnDoe = new Employee("John","Doe",4567);
        Employee marySmith = new Employee("Marry","Smith",22);
        Employee mikeWilson = new Employee("Mike","Wilson",3245);
        Employee billEnd = new Employee("Bill","End",78);

        //array stack implementation
//        ArrayStack stack = new ArrayStack(10);
//        stack.push(janeJones);
//        stack.push(johnDoe);
//        stack.push(marySmith);
//        stack.push(mikeWilson);
//        stack.push(billEnd);
//        //stack.printStack();
//
//        System.out.println(stack.peek());
//
//        System.out.println("Popped: " + stack.pop());
//
//        System.out.println(stack.peek());

        //linked stack implementation
        LinkedStack stack = new LinkedStack();
        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(marySmith);
        stack.push(mikeWilson);
        stack.push(billEnd);

//        stack.printStack();
//        System.out.println(stack.peek());
//        stack.printStack();

        System.out.println(stack.pop());
        stack.printStack();

    }

}
