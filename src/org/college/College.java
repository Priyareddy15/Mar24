package org.college;

public class College {

	private void collegeName() {
		
		System.out.println("KTVR KPET");
		
	}
	private void collegeCode() {
	
		System.out.println("00256");
	}
	private void collegeRank() {
		
		System.out.println("3rd Rank");
	}
	
	public static void main(String[] args) {
		
		College u = new College();
		
		u.collegeName();
		u.collegeCode();
		u.collegeRank();
		
		Student j =new Student();
		
		j.studentName();
		j.studentDept();
		j.studentId();
		
		Hostel y = new Hostel();
		
		y.hostelName();
		
		Dept o = new Dept();
		
		o.deptName();
		
	}
	
}


