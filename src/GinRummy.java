/**
 * Created by jeremy on 4/20/17.
 */
public class GinRummy {

    public Action[] getAvailableActions(State state) {
        if (state.getHand().size() == 10) {
            return new Action[] {Action.DRAW_STOCK, Action.DRAW_DISCARD};
        } else {
            return new Action[] {Action.DISCARD};
        }
    }
}
