package pack1;

public class Student extends Person {

	private int marks;
	private char grade;
	
	private Address address;

	public Student(int id, String name, int marks, char grade, Address address) {
		super(id, name);
		this.marks = marks;
		this.grade = grade;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public int getMarks() {
		return marks;
	}

	public char getGrade() {
		return grade;
	}

}
