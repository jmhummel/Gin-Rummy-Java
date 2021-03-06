import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jeremy on 4/20/17.
 */
public class GinRummy {

    public static Action[] getAvailableActions(State state) {
        if (state.getHand().size() == 10) {
            return new Action[] {Action.DRAW_STOCK, Action.DRAW_DISCARD};
        } else if (isHandKnockable(state)) {
            return new Action[]{Action.KNOCK, Action.DISCARD};
        } else {
            return new Action[] {Action.DISCARD};
        }
    }

    public static boolean isHandKnockable(State state) {
        return calcDeadwood(state) <= 10;
    }


    private static HashMap<ArrayList<Card>, Integer> mem = new HashMap<>();

    public static int calcDeadwood(State state) {
        ArrayList<Card> hand = state.getHand();

        // TODO: some brainstorming

        /*
         * First, let go through each card in the hand and ask:
         * 1) "Is there a card of the same suit and rank + 1 or rank - 1 in this hand?
         * 2) "Is there a card of the same rank in this hand?
         *
         * If the answer to both of these questions is "No",
         * we can put it off to the side, it can't form any runs or sets.
         */

        /*
         * Now, with the remaining cards, are there any intersections?
         * Cards that could either be:
         * A) part of a run
         * B) part of a set
         */

        /*
         * Idea:
         * What if we make a graph, with an edge between any two cards that:
         * A) Have same suit, differ by 1 on rank
         * B) Have same rank
         *
         * Group any disconnected graphs separately.
         * Each graph will be one of three types:
         * 1) No set/runs (melds) exist
         * 2) Only one meld exists
         * 3) Two or more melds exist
         *
         * We will have to run an algorithm on the graphs of type 3, but that makes the search space much smaller.
         */

        /*
         * Let's do some Depth-first-searching
         *
         * 1  procedure DFS-iterative(G,v):
         * 2      let S be a stack
         * 3      S.push(v)
         * 4      while S is not empty
         * 5          v = S.pop()
         * 6          if v is not labeled as discovered:
         * 7              label v as discovered
         * 8              for all edges from v to w in G.adjacentEdges(v) do
         * 9                  S.push(w)
         */



        return 11;
    }
}
