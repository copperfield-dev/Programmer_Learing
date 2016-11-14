public class Saleroom {
	public static void main(String[] args) {
		double saleroom = 0;
		double salaries = 5000;
		double royalties = 0;

        while (salaries < 30000) {
        	if (saleroom <= 5000)
        		royalties = saleroom * 0.08;
        	else if (saleroom <= 10000)
        		royalties = (saleroom - 5000) * 0.1 + 5000 * 0.08;
        	else 
        	    royalties = (saleroom - 10000) * 0.12 + 5000 * 0.1 + 5000 * 0.08;

        	salaries = 5000 + royalties;
        	saleroom++;     
        }

        System.out.print(saleroom);
	}
}