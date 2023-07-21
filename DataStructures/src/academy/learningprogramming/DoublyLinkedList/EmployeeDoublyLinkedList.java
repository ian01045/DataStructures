package academy.learningprogramming.DoublyLinkedList;

import academy.learningprogramming.list.Employee;

public class EmployeeDoublyLinkedList {
    private EmployeeNode2 head;
    private EmployeeNode2 tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode2 node = new EmployeeNode2(employee);

        if(head == null)
        {
            tail = node;
        }
        else
        {
            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;
        size++;

    }

    public void addToEnd(Employee employee){
        EmployeeNode2 node = new EmployeeNode2(employee);
        if (tail == null )
        {
            head = node;
        }
        else
        {
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size ++;
    }

    public int getSize()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return head==null;
    }

    public EmployeeNode2 removeFromFront() {
        if(isEmpty()){
            return null;
        }

        EmployeeNode2 removedNode = head;

        if(head.getNext() == null){
            tail = null;
        }else{
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeNode2 removeFromEnd(){
        if(isEmpty()){
            return null;
        }

        EmployeeNode2 removedNode = tail;

        if(tail.getPrevious() == null){
            head = null;
        }else{
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }
    public void printList()
    {
        EmployeeNode2 current = head;
        System.out.print("HEAD -> ");
        while(current != null)
        {
            System.out.print(current);
            System.out.print(" <=> ");
            current=current.getNext();
        }
        System.out.print("null");
        System.out.println();

    }

    public boolean addBefore(Employee newEmployee, Employee existingEmployee){
        if(head == null)
        {
            return false;
        }

        //find the existing employee
        EmployeeNode2 current = head;
        while(current != null & !current.getEmployee().equals(existingEmployee)){
            current = current.getNext();
        }

        if(current == null){
            return false;
        }

        EmployeeNode2 newNode = new EmployeeNode2(newEmployee);
        newNode.setPrevious(current.getPrevious());
        newNode.setNext(current);
        current.setPrevious((newNode));

        if(current == head){
            head = newNode;
        }else{
            newNode.getPrevious().setNext(newNode);
        }

        size++;

        return true;
    }





}
