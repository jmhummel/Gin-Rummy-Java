/**
 * Created by jeremy on 4/19/17.
 */
public enum Rank {
    ACE (1, 1, "ace", "A"),
    TWO (2, 2, "two", "2"),
    THREE (3, 3, "three", "3"),
    FOUR (4, 4, "four", "4"),
    FIVE (5, 5, "five", "5"),
    SIX (6, 6, "six", "6"),
    SEVEN (7, 7, "seven", "7"),
    EIGHT (8, 8, "eight", "8"),
    NINE (9, 9, "nine", "9"),
    TEN (10, 10, "ten", "10"),
    JACK (11, 10, "jack", "J"),
    QUEEN (12, 10, "queen", "Q"),
    KING (13, 10, "king", "K");

    private final int order;
    private final int value;
    private final String name;
    private final String symbol;

    Rank(int order, int value, String name, String symbol) {
        this.order = order;
        this.value = value;
        this.name = name;
        this.symbol = symbol;
    }

    public String toString() {
        return symbol;
    }
}
