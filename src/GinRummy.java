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
        // TODO: logic
        return false;
    }
}
