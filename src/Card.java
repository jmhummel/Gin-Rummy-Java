/**
 * Created by jeremy on 4/19/17.
 */
public class Card {
    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String toString() {
        return rank.toString() + suit.toString();
    }

    public String getFullName() {
        return rank.name() + " of " + suit.name();
    }

    public static Card fromString(String s) throws Exception {
        Rank rank = Rank.fromString(s.charAt(0));
        Suit suit = Suit.fromString(s.charAt(1));
        return new Card(rank, suit);
    }
}
