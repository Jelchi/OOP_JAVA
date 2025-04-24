package Models;

/**
 * The Red Deck which holds cards of type Color.
 *
 * 
 *          
 */
public class RedDeck extends Deck<Color, Card<Color>>
{
    /**
     * Constructor for the Red Deck
     */
    public RedDeck()
    {
        super("Red Deck");
    }

    /**
     * Build the Red Deck.
     * 
     * This is specifically: 1 Red Card and 4 Black Cards
     */
    
    @Override
    public void populateDeck()
    {
        destroyDeck();

        for (int i = 0; i < 4; i++)
        {
            drawingStack.add(new Card<Color>(Color.BLACK));
        }

        drawingStack.add(new Card<Color>(Color.RED));
    }
}
