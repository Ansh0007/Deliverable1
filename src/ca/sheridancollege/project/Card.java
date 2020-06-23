/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * @author Ansh 23 June 2020
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author Ansh
 */
 public abstract class Card
    { 
    private String color;
    private int value;
    //array is added for colors and values.
    public static String colors[] = {"hearts", "tiles", "clovers", "pikes"};
    public static int values[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    public Card(int val, String col) { //constructor is added
        this.color = col;
        this.value = val;
    }

    public int getValue() { //returns the value of value.
        return this.value;
    }

    public boolean isGreaterThan(Card card) {
        return (this.value > card.getValue());
        
    }
}

