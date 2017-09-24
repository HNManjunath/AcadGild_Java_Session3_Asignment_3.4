package assignment3_4;

/**
 * @author MANJUNATH, this class has attributes of student class and getter and
 *         setters.
 *
 */
public class Student {

	// Student Attributes
	private String name;
	private String rollNumber;
	private String phoneNumber;
	private String studentClass;

	// Getter and setters of student class attributes
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	// Constructor with Parameters
	Student(String name, String rollNumber, String phoneNumber, String studentClass) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.phoneNumber = phoneNumber;
		this.studentClass = studentClass;
	}

	// Method to evaluate Students Marks
	public boolean result(String rollNo, int physicsMarks, int chemistryMarks, int mathsMarks) {
		boolean status = false;

		if (physicsMarks < 35 || chemistryMarks < 35 || mathsMarks < 35) {
			status = false;
			return status;
		} else {
			status = true;
		}

		return status;
	}
}