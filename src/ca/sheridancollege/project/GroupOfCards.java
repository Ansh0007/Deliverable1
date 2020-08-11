package ca.sheridancollege.project;

/**
 * This class +++Insert Description+++
 *
 * @author Ansh
 */

public abstract class GroupOfCards
{
     private String color;
    private int value;
    
    public GroupOfCards(){
        
    }
    
    public String getName(){
        return color;
    }
    
    public void setColor(String name){
        this.color=color;
    }
    
    public int getValue(){
        return value;
    }
    
    public void setValue(){
        this.value=value;
    }
    
    public boolean isGreaterThan(Card card) {
        return (this.value > card.getValue());
}
}


