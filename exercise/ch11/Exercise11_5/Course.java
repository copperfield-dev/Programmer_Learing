public class Course {
	private String courseName;
	private java.util.ArrayList students = new java.util.ArrayList();

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		students.add(student);
	}

	public String[] getStudents() {
		String[] temp = new String[students.size()];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = (String)students.get(i);
		}
		return temp;
	}

	public int getNumberOfStudents() {
		return students.size();
	}

	public String getCourseName() {
		return courseName;
	}
}