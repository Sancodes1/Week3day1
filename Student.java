package org.student;

import org.department.Department;

public class Student extends Department {
	
	
	public void StudentName() {
		System.out.println("StudentName -Student class org.Student");
	}
	
	public void studentDept() {
		System.out.println("studentDept -Student class org.Student");
	}

	public void studentId() {
		System.out.println("studentId -Student class org.Student");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Student student = new Student();
		student.collegeCode();
		student.collegeName();
		student.collegeRank();
		student.deptName();
		student.StudentName();
		student.studentDept();
		student.studentId();
	}

}
