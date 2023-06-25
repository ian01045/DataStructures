package academy.learningprogramming.DoublyLinkedList;

import academy.learningprogramming.list.Employee;

public class EmployeeNode2 {


    private Employee employee;

    private EmployeeNode2 next;

    private EmployeeNode2 previous;

    public EmployeeNode2(Employee employee){
        this.employee=employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode2 getNext() {
        return next;
    }

    public void setNext(EmployeeNode2 next) {
        this.next = next;
    }

    public EmployeeNode2 getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeNode2 previous) {
        this.previous = previous;
    }

    public String toString()
    {
        return employee.toString();
    }
}
