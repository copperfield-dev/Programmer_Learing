public class SumOfCards {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                          "10", "Jack", "Queen", "King"};

	    for (int i = 0; i < deck.length; i++)
            deck[i] = i;

        int times = 0;
        while (true) {
            for (int i = 0; i < deck.length; i++) {
                int index = (int)(Math.random() * deck.length);
                int temp = deck[i];
                deck[i] = deck[index];
                deck[index] = temp;
            }
            int sum = 0;

            for (int i = 0; i < 4; i++) {
                String suit = suits[deck[i] / 13];
                sum += deck[i] % 13 + 1;
            }
            if (sum == 24) {
                times++;
                break;
            }
                    
            times++;
        }
        
        System.out.print(times);
    }
}