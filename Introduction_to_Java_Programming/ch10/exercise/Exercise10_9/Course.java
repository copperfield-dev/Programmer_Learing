public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		if (numberOfStudents >= students.length) {
			String[] temp = new String[students.length * 2];
			System.arraycopy(students, 0, temp, 0, students.length);
			students = temp;
		}
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i].equals(student)){
				for (int k = i + 1; k < numberOfStudents; k++) {
                    students[k - 1] = students[k];
                }
				numberOfStudents--;
				break;
			}
		}
	}

	public void clear() {
		String[] temp = new String[100];
		students = temp;
		numberOfStudents = 0;
	}
}