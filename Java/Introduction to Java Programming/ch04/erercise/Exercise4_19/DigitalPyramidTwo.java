public class DigitalPyramidTwo {
    public static void main(String[] args){
        for (int i = 1; i <= 8; i++) {
            int digital = 1;
        	for (int j = 8 - i; j > 0; j--) {
        		System.out.print("     ");
        	}
        	for (int k = i; k >= 1; k--) {
                System.out.printf("%5d", digital);
                digital = digital * 2;
        	}
            digital = digital / 2;
            for (int k = 2; k <= i; k++) {
                digital = digital / 2;
            	System.out.printf("%5d", digital);
            }
            System.out.print("\n");
        }
    }
}