public class FourPictures {
    public static void main(String[] args){
        for (int i = 1; i <= 6; i++) {
        	for (int j = 1; j <= i; j++) {
        		System.out.printf("%2d", j);
        	}
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 7 - i; j++) {
                System.out.printf("%2d", j);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.printf("%2d", k);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 7 - i; k++) {
                System.out.printf("%2d", k);
            }
            System.out.print("\n");
        }
    }
}