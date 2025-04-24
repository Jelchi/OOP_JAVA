/**
 * The abstract class Item describes the properties and functions
 * that an item in a fantasy game can have.  This includes the item's
 * name, value, and weight.  An Item can be "used", allowing for a
 * descriptive string of the use to be returned to the user.
 *
 */
public abstract class Item implements Comparable<Item>
{
    /**
     * The current number of Item objects that have
     * been created.
     */
    private static int numberOfItems = 0;
    
    /**
     * The unique identifier for this Item instance.
     */
    private int id;
    
    /** 
     * The value of the item, in gold pieces.
     */
    private int value;
    
    /**
     * The name of the item.
     */
    private String name;

    /**
     * The weight of the item, in fantasy units.
     */
    private double weight;
    
    /**
     * Reset the object ID counter.
     * 
     * This is useful when you have multiple Junit Test classes
     * (call this method within the unit test @BeforeClass method).
     */
    public static void reset()
    {
        numberOfItems = 0;
    }
    
    /**
     * "Uses" the Item, returning a descriptive string
     * of what happened when used.
     * 
     * @return The text describing what happened when using the item.
     */
    public abstract String use();
    
    /**
     * Item Constructor
     * 
     * @param name Name of the item.
     * @param value Value of the item.
     * @param weight Weight of the item.
     */
    public Item(String name, int value, double weight)
    {
        // TODO: complete implementation
    	this.name =  name; 
    	this.value = value; 
    	this.weight = weight; 
    	this.id =  numberOfItems++; 
    }
    
    /**
     * Object ID number
     * 
     * @return the ID
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Value of the item
     * 
     * @return the value
     */
    public int getValue()
    {
        return value;
    }

    /**
     * Name of the item
     * 
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Item weight
     * 
     * @return the weight
     */
    public double getWeight()
    {
        return weight;
    }

    /**
     * Change the value of the item
     * 
     * @param value the value to set
     */
    public void setValue(int value)
    {
        this.value = value;
    }

    /**
     * Change the name of the item 
     * 
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Set the weight of the item
     * 
     * @param weight the weight to set
     */
    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    /**
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     * 
     * First compares the value of the Items, defaults to
     * lexicographical ordering (Comparing by the value of
     * the letters, not the case.  i.e. A == a) if they are equal.
     * 
     * @param other The other Item to compare against.
     * @return -1, 0, or 1 based on the rules defined above.
     */
    public int compareTo(Item other)
    {
        // TODO: complete implementation
    	if(this.value < other.getValue()) {
    		return -1; 
    	} else if(this.value > other.getValue()) {
    		return 1; 
    	} else {
    		if(this.name.compareToIgnoreCase(other.getName())>0){
    			return 1; 
    		} else if(this.name.compareToIgnoreCase(other.getName())<0) {
    			return -1; 
    		} else {
    			return 0; 
    		}
    	}
    }
    
    /** Return a description of the item
     * 
     * @see java.lang.Object#toString()
     * @return A String describing the item
     */
    @Override
    public String toString()
    {
        // TODO: complete implementation
    	return this.name +" -- ID: "+Integer.toString(id+1)+", Value: " + Integer.toString(this.value)+", Weight: "+ String.format("%.2f", this.weight); 
    }
}
