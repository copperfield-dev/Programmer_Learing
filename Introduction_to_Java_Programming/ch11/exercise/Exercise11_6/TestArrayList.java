import java.util.*;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		Loan loan = new Loan();
		Date date = new Date();
		String string = new String();
		javax.swing.JFrame jframe = new javax.swing.JFrame();
		Circle circle = new Circle();

		list.add(loan);
		list.add(date);
		list.add(string);
		list.add(jframe);
		list.add(circle);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
}