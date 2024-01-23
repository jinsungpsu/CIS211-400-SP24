import java.util.Arrays;
import java.util.Random;

public class ArrayDeck implements Deck {
    /*
    the "bottom" of this deck of cards
    is index 0 in the cards array
     */
    private final int DEFAULT_SIZE = 52;
    private int[] cards = new int[DEFAULT_SIZE];

    private int count = 0;

    public ArrayDeck() {
        // default constructor...
    }


    @Override
    public void shuffle() {
        // used chatGPT for this section...
        Random rand = new Random();

        for (int i = count - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);

            // Swap cards[i] and cards[j]
            int temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    @Override
    public void initializeFiftyTwo() {
        fillDeck(52);
    }

    private void fillDeck(int numCards) {
        for (int i = 0; i < numCards; i++) {
            cards[i] = i;
        }
        count = numCards;
    }

    @Override
    public int getTopCard() {
        // returns the value of the "top" of this deck of cards...

        return cards[count-1];
    }

    @Override
    public void removeTopCard() {
        count--;
        cards[count] = -1;  // THIS LINE OF CODE IS KIND OF UNNECESSARY
                            // THIS MEMORY IS ALREDY ALLOCATED
                            // updating the count variable takes
                            // care of all the logic/algorithms
                            // for the rest of this implementation
                            // to still work correctly
    }

    @Override
    public void dealCards(Deck cards, int num) {
        for (int i = 0; i < num; i++) {
            this.cards[i] = cards.getTopCard();
            cards.removeTopCard();
        }

        count = num;

    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("[");
        for (int i = 0; i < count; i++) {
            output.append(cards[i] + " ");
        }
        output.append("]");
        return output.toString();
    }
}
