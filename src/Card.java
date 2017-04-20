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
}
