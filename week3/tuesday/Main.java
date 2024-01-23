public class Main {
    public static void main(String[] args) {
        Deck p1 = new ArrayDeck();
        Deck p2 = new ArrayDeck();
        Deck allCards = new ArrayDeck();
        allCards.initializeFiftyTwo();
        int p1score = 0, p2score = 0;
        allCards.shuffle();
        p1.dealCards(allCards, 10);
        p2.dealCards(allCards, 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("P1 cards: " + p1);
            System.out.println("P2 cards: " + p2);
            if (p1.getTopCard() > p2.getTopCard()) {
                // p1 won round
                System.out.println("p1 wins this round.");
                p1score++;
            } else {
                // p2 won round
                System.out.println("p2 wins this round.");
                p2score++;
            }
            p1.removeTopCard();
            p2.removeTopCard();
        }
        if (p1score > p2score) {
            System.out.println("P1 wins the game!");
        } else if (p2score > p1score){
            System.out.println("P2 wins the game!");
        } else {
            System.out.println("Tie!");
        }
    }
}