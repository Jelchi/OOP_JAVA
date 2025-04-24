package Models;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test Class for the Green Deck
 *
 *
 */
public class GreenDeckTest 
{

    /**
     * Confirm that the Green deck has both stacks
     */
    @Test
    public void greenDeckConstructorTest() 
    {
        GreenDeck r = new GreenDeck();
        
        Assert.assertNotNull("Discard stack not created.", r.discardStack);
        Assert.assertNotNull("Drawing stack not created.", r.drawingStack);
    }
    
    /**
     * Check status of stacks after cards have been added
     */
    @Test
    public void populateGreenDeckTest()
    {
        GreenDeck r = new GreenDeck();
        
        r.populateDeck();

        Assert.assertEquals("Initial drawing stack does not have 5 cards.", 5, r.drawingStack.size());
        Assert.assertEquals("Initial discard stack does not have 0 cards.", 0, r.discardStack.size());
    }
    
    /**
     * Check the contents of the initial drawing stack
     */
    @Test
    public void contentsOfPopulatedGreenDeckTest()
    {
        // Create the deck
        GreenDeck r = new GreenDeck();
        
        // Populate the dek
        r.populateDeck();
        
        int numberOfBlack = 0;
        int numberOfGreen = 0;
        
        Color card;
        
        // Loop until there are no cards in the stack
        while (!r.drawingStack.isEmpty())
        {
            // Get the value of the next card
            card = r.drawCard();
            
            // Count the card types
            if (card == Color.GREEN)
            {
                numberOfGreen++;
            }
            else
            {
                numberOfBlack++;
            }
        }
        
        Assert.assertEquals("Green deck does not have 1 Green card.", 1, numberOfGreen);
        Assert.assertEquals("Green deck does not have 4 black cards.", 4, numberOfBlack);
        Assert.assertEquals("After drawing all cards from Green deck, there are still cards left.", 
                0, r.drawingStack.size());
        Assert.assertEquals("After drawing all cards from Green deck, there are not 5 cards in the discard stack", 
                5, r.discardStack.size());
    }

    /**
     * Draw down the stack & then reset.  We should end up with all of the cards in the drawing stack again.
     */
    @Test
    
    public void resetGreenDeckTest()
    {
        // Create and populate deck
        GreenDeck r = new GreenDeck();
        
        r.populateDeck();
        
        // Draw down all of the cards
        while (!r.drawingStack.isEmpty())
        {
            r.drawCard();
        }
        
        // Reset the deck
        r.resetDeck();
        
        Assert.assertEquals("After resetting the Green deck, there are not 5 cards in the drawing stack", 
                5, r.drawingStack.size());
        Assert.assertEquals("After resetting the Green deck, there are not 0 cards in the discard stack", 
                0, r.discardStack.size());
    }
    
    /**
     * Check the destroy deck operation
     */
    @Test
    public void destroyGreenDeckTest()
    {
        // Create and populate the deck
        GreenDeck r = new GreenDeck();
        
        r.populateDeck();
        
        // Destroy  the deck
        r.destroyDeck();

        Assert.assertEquals("After destroying the Green deck, there are not 0 cards in the discard stack.", 
                0, r.discardStack.size());
        Assert.assertEquals("After destroying the Green deck, there are not 0 cards in the drawing stack.",
                0, r.drawingStack.size());
    }
    
    /**
     * Force a shuffle: should result in a reset
     */
    @Test
    public void drawCardFromEmptyGreenDeckTest()
    {
        // Create and populate the deck
        GreenDeck r = new GreenDeck();
        
        r.populateDeck();
        
        // Draw down the deck
        while (!r.drawingStack.isEmpty())
        {
            r.drawCard();
        }
        
        //Force a shuffle by drawing one more card
        r.drawCard();
        
        Assert.assertEquals("After shuffling the Green deck, there are not 4 cards in the drawing stack.", 
                4, r.drawingStack.size());
        Assert.assertEquals("After shuffling the Green deck, there is not 1 card in the discard stack",
                1, r.discardStack.size());
    }
}
