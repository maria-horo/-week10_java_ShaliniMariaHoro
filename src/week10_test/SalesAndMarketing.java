package week10_test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//4
public class SalesAndMarketing {

	public static void maleFemaleInSalesMarketing() {

		List<Employee> list = EmployeeDetails.employeeDetailsList();
		Map<String, Map<String, Long>> genderCountByDepartment = list.stream().filter(employee -> employee.getDepartment().equals("Sales") || employee.getDepartment().equals("Marketing"))
				.collect(Collectors.groupingBy(
						Employee::getDepartment,
						Collectors.groupingBy(Employee::getGender, Collectors.counting())));

		System.out.println(genderCountByDepartment);
	}

}
