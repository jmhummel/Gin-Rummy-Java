/**
 * Created by jeremy on 4/19/17.
 */
public enum Suit {
    CLUB ("clubs", "♣️"),
    DIAMOND ("diamonds", "♦️"),
    HEART ("hearts", "♥️"),
    SPADE ("spades", "♠️");

    private final String name;
    private final String symbol;

    Suit(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String toString() {
        return symbol;
    }
}
