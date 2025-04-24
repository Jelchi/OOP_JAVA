package Models;

/**
 * The Fate Deck which holds cards of type Color.
 *
 * 
 *          
 */
public class FateDeck extends Deck<Fate, Card<Fate>>
{
    /**
     * Constructor for the Fate Deck
     */
	
    public FateDeck()
    {
        super("Fate Deck");
    }
    
    /**
     * Build the Fate Deck.
     * 
     * This is specifically: 1 Revolution card and 1 Riches Card
     */

    @Override
    public void populateDeck()
    {
    	destroyDeck();

        drawingStack.add(new Card<Fate>(Fate.REVOLUTION));
        drawingStack.add(new Card<Fate>(Fate.RICHES));
    }
}
