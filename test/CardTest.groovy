/**
 * Created by jeremy on 4/22/17.
 */
class CardTest extends groovy.util.GroovyTestCase {
    void testEquals() {
        Card c1 = new Card(Rank.ACE, Suit.SPADE)
        Card c2 = new Card(Rank.ACE, Suit.SPADE)
        Card c3 = new Card(Rank.ACE, Suit.CLUB)
        Card c4 = new Card(Rank.THREE, Suit.CLUB)

        assertEquals(true, c1 == c2)
        assertEquals(false, c1 == c3)
        assertEquals(false, c3 == c4)
        assertEquals(false, c1 == c4)
    }

    void testHashCode() {
        Card c1 = new Card(Rank.ACE, Suit.CLUB)
        Card c2 = new Card(Rank.TWO, Suit.CLUB)
        Card c3 = new Card(Rank.ACE, Suit.DIAMOND)

        assertEquals(0, c1.hashCode())
        assertEquals(1, c2.hashCode())
        assertEquals(13, c3.hashCode())
    }

    void testCompareTo() {
        Card c1 = new Card(Rank.ACE, Suit.CLUB)
        Card c2 = new Card(Rank.TWO, Suit.CLUB)
        Card c3 = new Card(Rank.ACE, Suit.DIAMOND)

        assertEquals(true, c1 < c2)
        assertEquals(true, c1 < c3)
        assertEquals(true, c2 < c3)

    }
}
