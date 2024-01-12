package week10_test;

import java.util.List;
import java.util.stream.Collectors;

//6
public class ExistingEmployee {
	public static void main(String[] args) {
		List<Employee> list = EmployeeDetails.employeeDetailsList();
		list.stream().filter(i->i.getName().equalsIgnoreCase("gopi"))
		.collect(Collectors.toList()).forEach(employee -> System.out.println(employee));
	}

}
