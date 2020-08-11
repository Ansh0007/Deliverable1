/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * @author Ansh 23 June 2020
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author Ansh
 * 
 */
public class Player
{
     private String name;
    private int points;
    

    private ArrayList<Card> stack = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points += points;
    }

    public ArrayList<Card> getStack() {
        return stack;
    }

    public void giveCard(Card card) {
        stack.add(card);
    }
}