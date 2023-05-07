package academy.learningprogramming.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {

		List<Employee> employeeList = new Vector<>();

		employeeList.add(new Employee("Jane","Jones",123));
		employeeList.add(new Employee("John","Doe",4567));
		employeeList.add(new Employee("Mary","Smith",22));
		employeeList.add(new Employee("Mike","Wilson",3245));

//		employeeList.forEach(employee -> System.out.println(employee));

//		System.out.println(employeeList.get(1));

//		System.out.println(employeeList.isEmpty());

		employeeList.set(1,new Employee("Ian","Tsai",5858));

//		employeeList.forEach(employee -> System.out.println(employee));

//		System.out.println(employeeList.size());

		employeeList.add(3,new Employee("Han","Chen",2222));

//		employeeList.forEach(employee -> System.out.println(employee));

		Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

		for(Employee employee: employeeArray)
		{
			System.out.println(employee);
		}

		System.out.println(employeeList.contains(new Employee("Han","Chen",2222)));

		System.out.println(employeeList.indexOf(new Employee("Ian","Tsai",5858)));

		employeeList.remove(2);
		employeeList.forEach(employee -> System.out.println(employee));
	}


}
