package pack1;

public class Student extends Person {

	private int marks;
	private char grade;

	public Student(int id, String name, int marks, char grade) {
		super(id, name);
		this.marks = marks;
		this.grade = grade;
	}

	public int getMarks() {
		return marks;
	}

	public char getGrade() {
		return grade;
	}

}
