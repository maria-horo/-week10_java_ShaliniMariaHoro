package week10_test;

import java.util.List;

//2
public class EmployeesJoinedAfter2015 {
	
	public static void joinees() {	
		List<Employee> list = EmployeeDetails.employeeDetailsList();
		
		System.out.println("Employees jpoined after 2015 =");
		list.stream().filter(employee -> employee.getYearOfJoining() > 2015).map(Employee::getName)
                     .forEach(System.out::println);	
	}

}
