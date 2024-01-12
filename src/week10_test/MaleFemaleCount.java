package week10_test;

import java.util.List;
import java.util.stream.Collectors;

//1
public class MaleFemaleCount {

	public static void countOfMaleAndFemale(){
		List<Employee> list = EmployeeDetails.employeeDetailsList();

		long maleCount = list.stream()
				.filter(employee -> employee.getGender() == "Male")
				.collect(Collectors.counting());

		long femaleCount = list.stream()
				.filter(employee -> employee.getGender() == "Female")
				.collect(Collectors.counting());

		System.out.println("Number of male employees: "+maleCount);
		System.out.println("Number of male employees: "+femaleCount);
	}

}
