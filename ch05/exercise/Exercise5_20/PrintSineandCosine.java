public class PrintSineandCosine {
	public static void main(String[] args) {
		System.out.print("number\tsine\tcosine\n");
		for (int i = 0; i <= 36; i++) {
			System.out.print(10 * i + "\t" 
				+ (int)(Math.sin((double)(10 * i * Math.PI / 180)) * 10000) / 10000.0 + "\t"
				+ (int)(Math.cos((double)(10 * i * Math.PI / 180)) * 10000) / 10000.0 + "\n");
		}
	}
}