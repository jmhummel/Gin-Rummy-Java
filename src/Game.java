import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by jeremy on 4/19/17.
 */
public class Game {
    private Deck deck;
    private ArrayList<Card> discard;
    private ArrayList<Card> p1Hand;
    private ArrayList<Card> p2Hand;
    private ArrayList<Card>[] hands;
    public static final int HAND_SIZE = 10;
    private boolean knocked;
    private Player[] players;
    private int turn;

    public Game() {
        deck = new Deck();
        knocked = false;
        discard = new ArrayList<>();
        p1Hand = new ArrayList<>();
        p2Hand = new ArrayList<>();
        hands = new ArrayList[]{p1Hand, p2Hand};
        players = new Player[]{ new HumanPlayer(), new AIRandomPlayer() };
        turn = 0;

        IntStream.range(0, HAND_SIZE).forEach(
                i -> {
                    for (ArrayList<Card> hand : hands) {
                        hand.add(deck.draw());
                    }
                }
        );

        discard.add(0, deck.draw());

        while (!knocked && deck.size() > 2) {
            Player p = players[turn % players.length];
            // Draw
            // Discard / Knock
            Action action = p.promptAction(null, null);

        }


    }

    public String toString() {
        String s = "";
        s += "Deck: " + deck + "\n";
        s += "Discard: " + discard.stream().map(Object::toString).collect(Collectors.joining(", ")) + "\n";
        s += "P1 Hand: " + p1Hand.stream().map(Object::toString).collect(Collectors.joining(", ")) + "\n";
        s += "P2 Hand: " + p2Hand.stream().map(Object::toString).collect(Collectors.joining(", "));
        return s;
    }
}
