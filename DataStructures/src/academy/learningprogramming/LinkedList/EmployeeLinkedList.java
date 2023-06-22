package academy.learningprogramming.LinkedList;

import academy.learningprogramming.list.Employee;

public class EmployeeLinkedList {
    private EmployeeNode head;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;

    }

    public void printList()
    {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while(current != null)
        {
            System.out.print(current);
            System.out.print(" -> ");
            current=current.getNext();
        }
        System.out.print("null");

    }
}
