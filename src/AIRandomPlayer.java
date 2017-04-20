import java.util.Random;

/**
 * Created by jeremy on 4/20/17.
 */
public class AIRandomPlayer implements Player {
    @Override
    public Action promptAction(Action[] actions, State state) {
        Random random = new Random();
        int choice = random.nextInt(actions.length);
        return actions[choice];
    }

    @Override
    public Card promptCard(State state) {
        Random random = new Random();
        int choice = random.nextInt(state.getHand().size());
        return state.getHand().get(choice);
    }
}
