public class Saleroom2 {
    public static void main(String[] args) {
        double saleroom = 10000;
	double royalties = 0;

        while (saleroom <= 100000) {
        if (saleroom <= 5000)
            royalties = saleroom * 0.08;
        else if (saleroom <= 10000)
            royalties = (saleroom - 5000) * 0.1 + 5000 * 0.08;
        else 
            royalties = (saleroom - 10000) * 0.12 + 5000 * 0.1 + 5000 * 0.08;
        System.out.printf("%6.0f\t", saleroom);
        System.out.printf("%6.1f\n", royalties);
        saleroom += 5000;     
        }
    }
}