package com.in28minutes.oops.level2.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		Student student = new Student("Mike", "cecytem");
//		student.setName("Mike");
		student.setEmail("mahzarasua@outlook.com");

		Person person = new Person("Mike");
		String value = person.toString();
		System.out.println(value);
		System.out.println(person);

		Employee employee = new Employee("Mike", "Programmer");
//		employee.setName("Mike");
		employee.setEmail("mahzarasua@outlook.com");
		employee.setPhoneNumber("123456");
		employee.setTitle("Programmer");
		employee.setEmployeeGrade('A');

		System.out.println(employee);
	}

}
