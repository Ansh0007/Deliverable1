/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author Ansh
 */
public class Game
{

     //main method added to insert 2 players
    public static void main(String[] args) {
        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");
        
         int scoreA=0;   //score variable for both players initialised to 0
         int scoreB=0;
        
        ArrayList<Card> deck = new ArrayList<>();

        // Deck builder
        for (int i = 0; i < Card.colors.length; i++) {
            for (int j = 0; j < Card.values.length; j++) {
                Card card = new Card(Card.values[j], Card.colors[i]) {};

                deck.add(card);
            }
        }

        // Mix cards
        Collections.shuffle(deck); 

        // Divide the deck evenly among the two players
        for (int i = 0; i < deck.size(); i = i + 2) {
            p1.giveCard(deck.get(i));
            p2.giveCard(deck.get(i + 1));
           
        }

        int gains = 1;  //gains are initialised to 1
        for (int i = p1.getStack().size(); i > 0; i--) {
            if (p1.getStack().get(i - 1).isGreaterThan(p2.getStack().get(i - 1))) {
                p1.setPoints(gains);
                gains++;
            } else if (p2.getStack().get(i - 1).isGreaterThan(p1.getStack().get(i - 1))) {
                p2.setPoints(gains);
                gains++;
            }else{
                
                gains++;
        }
            
            
           
        if (p1.getPoints() > p2.getPoints()) {   //checking the winner
            System.out.println(p1.getName() + " wins");
            scoreA++;
            
            
            
        } else if (p2.getPoints() > p1.getPoints()) {
            
            System.out.println(p2.getName() + " wins");
           scoreB++;
          
           
        } else {
            System.out.println("Draw");
        }
        
        }
        if(scoreA>scoreB){      //displaying if winner is A
            System.out.printf("Player A wins with score = %d%n",scoreA);
            
        }
        else if(scoreB>scoreA){   //displaying if winner is B
            System.out.printf("Player B wins with score = %d%n",scoreB);
        }
        else
            System.out.println("Draw");
    }
}
