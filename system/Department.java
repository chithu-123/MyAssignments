package org.system;

public class Department extends College {
	public void deptName() {
		System.out.println("Department of MCA");
	}
	public static void main(String[] args) {
		Department dt=new Department();
		dt.collegeName();
		dt.collegeCode();
		dt.collegeRank();
		dt.deptName();
	}

}
