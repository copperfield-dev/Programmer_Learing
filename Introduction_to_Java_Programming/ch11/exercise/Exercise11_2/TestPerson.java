public class TestPerson {
	public static void main(String[] args) {
		Person person1 = new Person("Nescafe", "", "", "");
		System.out.println(person1);
		Student person2 = new Student(4);
		person2.setName("Android");
		System.out.println(person2);
		Employee person3 = new Employee("", 100000, new MyDate(2014, 2, 14));
		person3.setName("Apple");
		System.out.println(person3);
		Faculty person4 = new Faculty();
		person4.setName("Windows");
		System.out.println(person4);
		Staff person5 = new Staff();
		person5.setName("Linux");
		System.out.println(person5);
	}
}