package model;

public class Student {
	
	int roll;
	public Student() {
		super();
		
	}
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	public Student(int roll ) {

		this.roll = roll;
	}
	public Student( String name) {
	
		
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public void setName(String name) {
		this.name = name;
	}
	String name;
	public void displayInfo() {
		System.out.println("Student [roll=" + roll + ", name=" + name + "]");
	}

}
