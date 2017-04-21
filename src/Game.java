import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by jeremy on 4/19/17.
 */
public class Game {
    private Deck deck;
    private ArrayList<Card> discard;
    private ArrayList<Card>[] hands;
    public static final int HAND_SIZE = 10;
    private boolean knocked;
    private Player[] players;
    private int turn;
    private static GinRummy ginRummy;

    public Game() {
        deck = new Deck();
        deck.shuffle();
        knocked = false;
        discard = new ArrayList<>();
        hands = new ArrayList[]{new ArrayList(), new ArrayList()};
        players = new Player[]{new HumanPlayer(), new AIRandomPlayer()};
        turn = 0;

        IntStream.range(0, HAND_SIZE).forEach(
                i -> {
                    for (ArrayList<Card> hand : hands) {
                        hand.add(deck.draw());
                    }
                }
        );

        discard.add(0, deck.draw());
    }

    public void run() {
        while (!knocked && deck.size() > 2) {
            Player p = players[turn % players.length];
            ArrayList<Card> hand = hands[turn % players.length];

            // Draw
            State state = new State(hand, deck.size(), discard);
            Action action = p.promptAction(ginRummy.getAvailableActions(state), state);
            Card card;
            switch (action) {
                case DRAW_STOCK:
                    card = deck.draw();
                    hand.add(card);
                    break;
                case DRAW_DISCARD:
                    card = discard.remove(0);
                    hand.add(card);
                    break;
            }

            // Discard or Knock
            state = new State(hand, deck.size(), discard);
            action = p.promptAction(ginRummy.getAvailableActions(state), state);

            switch (action) {
                case DISCARD:
                    card = p.promptCard(state);
                    hand.remove(card);
                    discard.add(0, card);

                    break;
                case KNOCK:
                    knocked = true;
                    break;
            }

            turn++;
        }
    }

    public String toString() {
        String s = "";
        s += "Deck: " + deck + "\n";
        s += "Discard: " + discard.stream().map(Object::toString).collect(Collectors.joining(", ")) + "\n";
        for (ArrayList<Card> hand : hands) {
            s += "Hand: " + hand.stream().map(Object::toString).collect(Collectors.joining(", ")) + "\n";
        }
        return s;
    }
}
