package academy.learningprogramming.hashtables;

import academy.learningprogramming.list.Employee;

public class StoredEmployee {

    public String key;
    public Employee employee;

    public StoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }
}
