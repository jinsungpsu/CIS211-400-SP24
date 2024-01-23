public interface Deck {
    public void shuffle();
    public void initializeFiftyTwo();
    public int getTopCard();
    public void removeTopCard();
    public void dealCards(Deck cards, int num);
}
