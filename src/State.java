import java.util.ArrayList;

/**
 * Created by jeremy on 4/20/17.
 */
public class State {
    private ArrayList<Card> hand;
    private int deckSize;
    private ArrayList<Card> discard;

    public State(ArrayList<Card> hand, int deckSize, ArrayList<Card> discard) {
        this.hand = hand;
        this.deckSize = deckSize;
        this.discard = discard;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public int getDeckSize() {
        return deckSize;
    }

    public ArrayList<Card> getDiscard() {
        return discard;
    }
}
