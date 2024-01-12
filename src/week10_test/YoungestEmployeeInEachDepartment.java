package week10_test;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

//3
public class YoungestEmployeeInEachDepartment {

	public static void youngestEmployee(){

		List<Employee> list = EmployeeDetails.employeeDetailsList();

		Map<String, Optional<Employee>> youngestByDepartment = list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.minBy(Comparator.comparingInt(Employee::getAge))));

		System.out.println(youngestByDepartment);
	}

}
