public class TestStock {
	public static void main(String[] args) {
		Stock stock = new Stock("Java", "Sun Microsystems Inc.");

		stock.previousClosingPrice = 4.5;
		stock.currentPrice = 4.35;

        System.out.println(stock.symbol + ", " + stock.name);
		System.out.println("Previous Closing Price: " + 
			stock.previousClosingPrice);
		System.out.println("Current Price: " + 
			stock.currentPrice);
		System.out.println("Price Change: " +
			stock.getChangePercent() * 100 + "%");
	}
}