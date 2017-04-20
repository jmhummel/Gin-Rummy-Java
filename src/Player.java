/**
 * Created by jeremy on 4/20/17.
 */
public interface Player {
    public Action promptAction(Action[] actions, State state);

    public Card promptCard(State state);
}
