package Models;

/**
 * 
 * A Card Class for a generic type of card
 *
 *
 * @param <T> The type of the cards
 */

public class Card<T> 
{
    private T cardValue;
    
    /**
     * Card of Type T Constructor
     * 
     * @param cardValue The value of the card
     */
    
    public Card(T cardValue)
    {
        this.cardValue = cardValue;
    }
    
    /**
     * Return the card's value
     * 
     * @return  The value of the card
     */
    
    public T getCardValue()
    {
        return cardValue;
    }
    
    /**
     * Turn the card into a string
     * 
     * @return String representation of the card
     */
    
    @Override
    public String toString()
    {
        return cardValue.toString();
    }
}
