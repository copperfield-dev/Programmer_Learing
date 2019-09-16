public class MilesToKilometers {
	public static void main(String[] args) {
		int miles;
		double kilometers;

		System.out.print("miles      kilometers\n");
		for (int i = 1; i <= 9; i++) {
			miles = i;
			kilometers = 1.609 * miles;
            System.out.print(miles + "           " + kilometers + "\n"); 
		}  

		miles = 10;
		kilometers = 1.609 * miles;
        System.out.print(miles + "          " + kilometers + "\n");  
	}
}