import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Created by jeremy on 4/19/17.
 */
public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public String toString() {
        return cards.stream().map(Object::toString).collect(Collectors.joining(", "));
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        return cards.remove(0);
    }
}
