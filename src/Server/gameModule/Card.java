package Server.gameModule;

/**
 * Wrapper class for cards
 * 
 * @author mouhyi
 *
 */

// all methods tested on Mar 31, 03:21pm
public class Card implements Comparable<Card> {

	private Suit suit;
	private Rank rank;

	/**
	 * Constructor
	 * 
	 * @author mouhyi
	 */
	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}

	/**
	 * Settors ang gettors TODO: delete setters: a card instance should be final
	 * 
	 * @author mouhyi
	 * 
	 */
	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	/**
	 * this method Creates a string representation of the card.
	 * 
	 * @author mouhyi
	 */
	public String toString() {
		return rank + " of " + suit;
	}

	/**
	 * This method overrides Object.equals(Object)
	 * 
	 * @param obj
	 *            The object which to compare this Card value. Must be a Card
	 *            object.
	 * @return true if the cards are equal, false otherwise
	 * @author mouhyi
	 */
	public boolean equals(Object obj) {
		if (obj instanceof Card)
			return (this.rank == ((Card) obj).rank);
		return false;
	}

	/***************************
	 * This method implements the Comparable part of this class. IT defines a
	 * natural ordering of cards based on its rank
	 * 
	 * @param c: The Card which to compare this Card value.
	 * @return A negative integer if this card is less than the Card argument;
	 *         zero if this Card is equal to the Card argument;
	 *         a positive number if this Card is greater than the Card argument.
	 * @author mouhyi
	 **/
	public int compareTo(Card c) {
		return (this.rank.compareTo(c.rank));

	}

	/**
	 * Compare two cards based on their suits in the following order: clubs
	 * (lowest),diamonds, hearts, and spades (highest). Call this method if two
	 * players have equally ranked low card to break the tie for the bring-in
	 * 
	 * @param c: Card object
	 * @return int
	 * @author mouhyi
	 */
	public int compareBySuit(Card c) {
		return (this.suit.compareTo(c.suit));
	}
}
