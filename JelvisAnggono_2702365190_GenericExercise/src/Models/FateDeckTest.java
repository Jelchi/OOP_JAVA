package Models; 

import org.junit.Assert;
import org.junit.Test;

/**
 * Test Class for the Fate Deck
 */
public class FateDeckTest 
{
    /**
     * Confirm that the fate deck has both stacks
     */
    @Test
    public void fateDeckConstructorTest() 
    {
        FateDeck f = new FateDeck();
        
        Assert.assertNotNull("Discard stack not created.", f.discardStack);
        Assert.assertNotNull("Drawing stack not created.", f.drawingStack);
    }
    
    /**
     * Check status of stacks after cards have been added
     */
    @Test
    public void populateFateDeckTest()
    {
        FateDeck f = new FateDeck();
        
        f.populateDeck();

        Assert.assertEquals("Initial drawing stack does not have 2 cards.", 2, f.drawingStack.size());
        Assert.assertEquals("Initial discard stack does not have 0 cards.", 0, f.discardStack.size());
    }
    
    /**
     * Check the contents of the initial drawing stack
     */
    @Test
    public void contentsOfPopulatedFateDeckTest()
    {
        // Create the deck
        FateDeck f = new FateDeck();
        
        // Populate the deck
        f.populateDeck();
        
        int numberOfRiches = 0;
        int numberOfRevolution = 0;
        
        Fate card;
        
        // Loop until there are no cards in the stack
        while (!f.drawingStack.isEmpty())
        {
            // Get the value of the next card
            card = f.drawCard();
            
            // Count the card types
            if (card == Fate.RICHES)
            {
                numberOfRiches++;
            }
            else
            {
                numberOfRevolution++;
            }
        }
        
        Assert.assertEquals("Fate deck does not have 1 riches card.", 1, numberOfRiches);
        Assert.assertEquals("Fate deck does not have 1 revolution card.", 1, numberOfRevolution);
        Assert.assertEquals("After drawing all cards from fate deck, there are still cards left.", 
                0, f.drawingStack.size());
        Assert.assertEquals("After drawing all cards from fate deck, there are not 2 cards in the discard stack", 
                2, f.discardStack.size());
    }

    /**
     * Draw down the stack & then reset.  We should end up with all of the cards in the drawing stack again.
     */
    @Test
    public void resetFateDeckTest()
    {
        // Create and populate deck
        FateDeck f = new FateDeck();
        
        f.populateDeck();
        
        // Draw down all of the cards
        while (!f.drawingStack.isEmpty())
        {
            f.drawCard();
        }
        
        // Reset the deck
        f.resetDeck();
        
        Assert.assertEquals("After resetting the fate deck, there are not 2 cards in the drawing stack", 
                2, f.drawingStack.size());
        Assert.assertEquals("After resetting the fate deck, there are not 0 cards in the discard stack", 
                0, f.discardStack.size());
    }
    
    /**
     * Check the destroy deck operation
     */
    @Test
    public void destroyFateDeckTest()
    {
        // Create and populate the deck
        FateDeck f = new FateDeck();
        
        f.populateDeck();
        
        // Destroy the deck
        f.destroyDeck();

        Assert.assertEquals("After destroying the fate deck, there are not 0 cards in the discard stack.", 
                0, f.discardStack.size());
        Assert.assertEquals("After destroying the fate deck, there are not 0 cards in the drawing stack.",
                0, f.drawingStack.size());
    }
    
    /**
     * Force a shuffle: should result in a reset
     */
    @Test
    public void drawCardFromEmptyFateDeckTest()
    {
        // Create and populate the deck
        FateDeck f = new FateDeck();
        
        f.populateDeck();
        
        // Draw down the deck
        while (!f.drawingStack.isEmpty())
        {
            f.drawCard();
        }
        
        // Force a shuffle by drawing one more card
        f.drawCard();
        
        Assert.assertEquals("After shuffling the fate deck, there is not 1 card in the drawing stack.", 
                1, f.drawingStack.size());
        Assert.assertEquals("After shuffling the fate deck, there is not 1 card in the discard stack",
                1, f.discardStack.size());
    }
}
