package Models;

/**
 * Full game implementation.
 * 
 * This game uses three decks of cards: 1x - Green Deck 1x - Red Deck
 * 1x - Fate Deck
 * 
 * RULES: 1) At the beginning of each game, the player draws a fate card. - if
 * the fate is of riches, the player uses the green deck - if the fate is of
 * revolution, the player uses the red deck 2) Each player reveals the top
 * card of their deck - Green beats Black - Black beats Red -
 * Red beats Green 3) Repeat Rule 2 if both players reveal Black
 * 
 * Scoring: If the player wins using the Green Deck, they get 1 point. If the
 * player wins with the Red Deck, they get 4 points.
 *
 * 
 */
public class Game
{
    /** The Green Deck */
    private GreenDeck greenDeck;

    /** The Red Deck */
    private RedDeck redDeck;

    /**
     * The Fate Deck. Decides which player gets the Green Deck and which
     * player gets the Red Deck.
     */
    
    private FateDeck fateDeck;

    /**
     * Used to invert the point-value constants for when the player loses.
     */
    
    private static final int PLAYER_LOST = -1;

    /**
     * Total points won from playing a red against an green Multiply by
     * constPlayerLost if the player played the Green card
     */
    
    private static final int RED_GREEN = 4;

    /**
     * Total points won from playing a black against a non-black
     * Multiply by constPlayerLost if the black beats the player's card
     */
    private static final int BLACK_NONBLACK = 1;

    /**
     * Game Constructor.
     * 
     * Create and populate all three decks.
     */
    
    public Game()
    {
        greenDeck = new GreenDeck();
        greenDeck.populateDeck();
        redDeck = new RedDeck();
        redDeck.populateDeck();
        fateDeck = new FateDeck();
        fateDeck.populateDeck();
    }

    /**
     * Ensures that all decks are ready to play, and passes the decks to the
     * play() method. This separation makes the stochastic nature of this game
     * easier to control during testing.
     * 
     * @return The total number of points the player either won or lost
     */
    
    public int playOnce()
    {
        ensureNewGame();
        return play(greenDeck, redDeck, fateDeck);
    }

    /**
     * Play one round of Fate.
     * 
     * Returns the point value of the player's perspective when a win condition
     * based on rule 2 is achieved.
     * 
     * @param green
     *            The shuffled-and-readied Green Deck
     * @param red
     *            The shuffled-and-readied Red Deck
     * @param fate
     *            The shuffled-and-readied Fate Deck
     * @return The number of points the player (not opponent) receives
     */
    
    public int play(GreenDeck emperorsDeck, RedDeck plebeianDeck, 
            FateDeck fateDeck)
    {
        // Draw a Fate card to decide who gets which deck
        // TODO: Implement
    	Fate fateCard = fateDeck.drawCard(); 
            
        // Let the user know which deck they've been given with a print
        // statement
        // TODO: Implement
    	System.out.print("***** You have ");
    	
    	 if (fateCard == Fate.RICHES)
         {
             // TODO: Implement
         	System.out.println("Green *****");
         	
         }
         // The Fate card is the Revolution card. Player gets the Red deck.
         else
         {
             // TODO: Implement
        		System.out.println("Red *****");
         }
    	
        // The Top card that each player draws during each round.
        Color player;
        Color opponent;

        // The Fate card is the Riches card. The player gets the Green deck.
        if (fateCard == Fate.RICHES)
        {
            // TODO: Implement
        	player = emperorsDeck.drawCard(); 
        	opponent = plebeianDeck.drawCard();         	
        }
        // The Fate card is the Revolution card. Player gets the Red deck.
        else
        {
            // TODO: Implement
        	player = plebeianDeck.drawCard(); 
        	opponent = emperorsDeck.drawCard(); 
        	
        }

        /*
         * Given that the Green Deck and the Red Deck both have the same
         * number of cards and contain the pre-specified types and amount of
         * cards inside of them, this is unreachable. However, this makes
         * Eclipse happy that all paths return some int.
         */
        System.out.println("You: "+ player);
        System.out.println("Opp: "+ opponent);
        
        int resultScore = 0;
        
        if(player == Color.GREEN && opponent == Color.BLACK) {
        	resultScore = RED_GREEN * PLAYER_LOST; 
        } 
        
        boolean checking = true; 
        
        while(checking) {
        	if(player == Color.BLACK && opponent == Color.BLACK) {
            	if(fateCard == Fate.RICHES) {
            		player = emperorsDeck.drawCard(); 
            		opponent = plebeianDeck.drawCard(); 
            		
            	} else {
            		player = plebeianDeck.drawCard(); 
            		opponent = emperorsDeck.drawCard(); 
            	}
            	
                System.out.println("You: "+ player);
                System.out.println("Opp: "+ opponent);
                
            }else if(player == Color.GREEN && opponent == Color.RED) {
            	resultScore = RED_GREEN*PLAYER_LOST; 
            	checking = false; 
            } else if(player == Color.RED && opponent ==  Color.GREEN) {
            	resultScore = RED_GREEN; 
            	checking = false; 
            } else if(player == Color.GREEN && opponent == Color.BLACK) {
            	resultScore = BLACK_NONBLACK; 
            	checking = false;
            } else if(player ==  Color.BLACK && opponent == Color.GREEN) {
            	resultScore = BLACK_NONBLACK * PLAYER_LOST; 
            	checking =  false; 
            } else if(player == Color.RED && opponent == Color.BLACK){
            	resultScore = BLACK_NONBLACK * PLAYER_LOST; 
            	checking = false; 
            } else if(player == Color.BLACK && opponent == Color.RED) {
            	resultScore = BLACK_NONBLACK; 
            	checking = false; 
            }
        }
        
        return resultScore;

    }

    /**
     * Ensure that all decks are reset to their respective drawing decks
     */
    
    private void ensureNewGame()
    {
        greenDeck.resetDeck();
        redDeck.resetDeck();
        fateDeck.resetDeck();
    }
}