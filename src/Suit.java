/**
 * Created by jeremy on 4/19/17.
 */
public enum Suit {
    CLUB ("clubs", "C", "♣️"),
    DIAMOND ("diamonds", "D", "♦️"),
    HEART ("hearts", "H", "♥️"),
    SPADE ("spades", "S", "♠️");

    private final String name;
    private final String letter;
    private final String symbol;

    Suit(String name, String letter, String symbol) {
        this.name = name;
        this.letter = letter;
        this.symbol = symbol;
    }

    public String toString() {
        return symbol;
    }

    public static Suit fromString(char s) throws Exception {
        for (Suit suit : Suit.values()) {
            if (s == suit.letter) {
                return suit;
            }
        }
        throw new Exception("Cannot convert: " + s + " from String to Suit");
    }
}
