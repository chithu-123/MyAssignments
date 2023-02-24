package org.system;

public class Student extends Department {
	public void studentName() {
		System.out.println("Chitra V");
	}
	public void studentDept() {
		System.out.println("MCA");

	}
	public void studentId() {
		System.out.println("234567");
	}
	public static void main(String[] args) {
		Student st=new Student();
		st.collegeCode();
		st.collegeName();
		st.collegeRank();
		st.deptName();
		st.studentName();
		st.studentDept();
		st.studentId();
	}
}
