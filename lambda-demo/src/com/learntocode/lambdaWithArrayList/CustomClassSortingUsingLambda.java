package com.learntocode.lambdaWithArrayList;

import java.util.ArrayList;
import java.util.Collections;

class Employee {
	int empid;
	String empName;

	public Employee(int empid, String empName) {
		this.empid = empid;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + "]";
	}

}

/**
 * Sorting custom Employee class object based on Emmployee_name using Lambda.
 * @author Abhijit thorat
 *
 */
public class CustomClassSortingUsingLambda {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(1, "Abhijit"));
		emp.add(new Employee(6, "Kiran"));
		emp.add(new Employee(10, "Mohan"));
		emp.add(new Employee(2, "Ashsih"));
		emp.add(new Employee(8, "Jhon"));
		
		System.out.println("Before Sorting:");
		System.out.println(emp);
		
		Collections.sort(emp,(e1,e2)->e1.empName.compareTo(e2.empName));
		
		System.out.println("After Sorting:");
		System.out.println(emp); 
	}

}
