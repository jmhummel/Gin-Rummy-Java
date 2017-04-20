/**
 * Created by jeremy on 4/20/17.
 */
public enum Action {
    DRAW_STOCK ("Draw from stock pile", "S"),
    DRAW_DISCARD ("Draw from discard pile", "T"),
    KNOCK ("Knock", "K"),
    DISCARD ("Discard", "D");

    private final String fullName;
    private final String symbol;

    public String toString() {
        return fullName + " (" + symbol + ")";
    }

    Action(String fullName, String symbol) {
        this.fullName = fullName;
        this.symbol = symbol;
    }
}
