/**
 * The abstract class Consumable describes items that can be
 * consumed by the player.  Consumables carry information
 * about whether or not they are spoiled, and if they have been consumed.
 *
 *
 */
public abstract class Consumable extends Item
{
    /**
     * Whether or not this Consumable has been "consumed".
     */
    private boolean consumed;
    
    /**
     * Whether or not this Consumable is "spoiled."
     */
    private boolean spoiled;
    
    /**
     * @return A String describing the consuming of this Consumable.
     */
    public abstract String eat();

    /**
     * @param name The name of the Consumable.
     * @param price The price of the Consumable.
     * @param weight The weight of the Consumable.
     * @param spoiled Whether or not the Consumable is spoiled.
     */
    public Consumable(String name, int price, double weight, boolean spoiled)
    {
        super(name, price, weight);
        
        consumed = false;
        this.spoiled = spoiled;
    }
    
    /**
     * @see Item#use()
     * 
     * The abstract method use() defined by the abstract Item class is
     * implemented here, where if the Consumable has not been consumed,
     * it is "eaten" and the description returned by eat() is returned
     * by use().
     * 
     * If the item is spoiled, then text describing the player
     * as becoming sick is appended to this returned string.
     * 
     * If the Consumable has already been consumed, then a string
     * informing the player of this is returned.
     * 
     * @return a descriptive String of the consumption of the Consumable.
     */
    public String use()
    {
        String result;
        
        // TODO: complete implementation
        if(consumed == false && spoiled == false) {
        	result = eat() +"\n You eat the bread."; 
        } else if(consumed == true && spoiled == false) {
        	result = "There is nothing left of the " + this.getName()+" to consume"; 
        } else {
        	result = eat()+"\n You feel sick."; 
        }
        
        return result;
    }

    /**
     * Consumed getter
     * 
     * @return the consumed property
     */
    public boolean isConsumed()
    {
        return consumed;
    }

    /**
     * Consumed setter
     * 
     * @param consumed the consumed to set
     */
    public void setConsumed(boolean consumed)
    {
        this.consumed = consumed;
    }
    
    /**
     * Spoiled getter
     * 
     * @return the spoiled
     */
    public boolean isSpoiled()
    {
        return spoiled;
    }
    
    /**
     * Describe the item.
     * 
     * @see Item#toString()
     * @return String describing the Consumable object.
     */
    @Override
    public String toString()
    {
        return String.format("%s, Consumed: %b, Spoiled: %b\n",
                super.toString(), consumed, spoiled);
    }
}
