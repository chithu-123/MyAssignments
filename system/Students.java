package org.system;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student ID: "+id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("Student ID: "+id);
		System.out.println("Student Name: "+name);
	}
	public void getStudentInfo(String email,String phonenumber) {
		System.out.println("Student Email: "+email);
		System.out.println("Student Phonenumber: "+phonenumber);
	}
	public static void main(String[] args) {
		Students st=new Students();
		st.getStudentInfo(2345);
		st.getStudentInfo(2345, "Chitra");
		st.getStudentInfo("chithuec", "7608976011");
	}
	

}
