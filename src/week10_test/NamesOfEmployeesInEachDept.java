package week10_test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//5
public class NamesOfEmployeesInEachDept {

	public static void employeesIneachDepartment() {

		List<Employee> list = EmployeeDetails.employeeDetailsList();

		Map<String, List<String>> employeesByDepartment = list.stream()
				.collect(Collectors.groupingBy(
						Employee::getDepartment,
						Collectors.mapping(Employee::getName, Collectors.toList())
						));
		System.out.println(employeesByDepartment);


	}
}
