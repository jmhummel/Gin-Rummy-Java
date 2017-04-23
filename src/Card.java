/**
 * Created by jeremy on 4/19/17.
 */
public class Card implements Comparable{
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

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {return true;}
        if (obj == null) {return false;}
        if (!(obj instanceof Card)) {return false;}
        Card c = (Card) obj;
        return (this.suit == c.suit && this.rank == c.rank);
    }

    @Override
    public int hashCode() {
        return suit.ordinal() * 13 + rank.ordinal();
    }


    @Override
    public int compareTo(Object o) {
        return ((Integer)hashCode()).compareTo(o.hashCode());
    }
}
