public class Cards {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                          "10", "Jack", "Queen", "King"};

	    for (int i = 0; i < deck.length; i++)
            deck[i] = i;

        int times = 0;
        boolean[] isPicked = new boolean[4];
        for (int i = 0; i < 4; i++) {
            isPicked[i] = false;
        }
        while (true) {
            for (int i = 0; i < deck.length; i++) {
                int index = (int)(Math.random() * deck.length);
                int temp = deck[i];
                deck[i] = deck[index];
                deck[index] = temp;
            }
            
            String suit = suits[deck[14] / 13];
            String rank = ranks[deck[14] % 13];
            if (isPicked[deck[14] / 13] == false) {
                isPicked[deck[14] / 13] = true;
                System.out.println(rank + " of " + suit); 
            }
            
            times++;
            if (isPicked[0] == true && isPicked[1] == true
                && isPicked[2] == true && isPicked[3] == true)
                break;
        }
        
        System.out.print("Number of picks: " + times);
    }
}