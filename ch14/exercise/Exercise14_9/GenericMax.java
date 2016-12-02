public class GenericMax {
	public static void main(String[] args) {
		Integer[] intArray = {new Integer(2), new Integer(4),
		    new Integer(3), new Integer(5), new Integer(6),
		    new Integer(7), new Integer(8), new Integer(9),
		    new Integer(10), new Integer(15)};

	    String[] stringArray = {"Tom", "John", "Fred", "Messi", "Eto", 
	        "Henry", "James", "Wade", "Allen", "Bosh"};

	    java.util.GregorianCalendar[] dateArray = {new java.util.GregorianCalendar(2011, 2, 14),
	                                               new java.util.GregorianCalendar(2014, 2, 14),
	                                               new java.util.GregorianCalendar(2013, 2, 14),
	                                               new java.util.GregorianCalendar(2018, 2, 14),
	                                               new java.util.GregorianCalendar(2023, 2, 14),
	                                               new java.util.GregorianCalendar(2001, 2, 14), 
	                                               new java.util.GregorianCalendar(2003, 2, 14),
	                                               new java.util.GregorianCalendar(2007, 2, 14),
	                                               new java.util.GregorianCalendar(2009, 3, 14),
	                                               new java.util.GregorianCalendar()};

	    System.out.println("Max Integer object: " + max(intArray));
	    System.out.println("Max String object: " + max(stringArray));
	    System.out.println("Max GregorianCalendar object: " + max(dateArray));
	}

	public static Object max(Comparable[] a) {
		Comparable currentMax = a[0];

		for (int i = 1; i < a.length - 1; i++) 
			if (currentMax.compareTo(a[i]) < 0) 
				currentMax = a[i];
        return (Object)currentMax;
	}
}