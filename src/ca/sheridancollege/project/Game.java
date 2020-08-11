/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * @author Ansh 23 June 2020
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author Ansh
 */
public class Game
{

      public static void main(String[] args) {
        char choice=0;
        int scoreA=0;
        int scoreB=0;
        do{
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter Player 1  ");
        String pr1=sc.nextLine();
        System.out.print("Please enter Player 2  ");
        String pr2=sc.nextLine();
        
      
        
        Player p1 = new Player(pr1);
        Player p2 = new Player(pr2);
        
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

        int gains = 1;
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
            
            

        if (p1.getPoints() > p2.getPoints()) {
            System.out.println(p1.getName() + " wins");
            scoreA++;
            
            
        } else if (p2.getPoints() > p1.getPoints()) {
            
            System.out.println(p2.getName() + " wins");
           scoreB++;
          
           
        } else {
            System.out.println("Draw");
        }
       
        
        }
         if(scoreA>scoreB){      //displaying if winner is first player
            System.out.printf(pr1+" wins with score = %d%n",scoreA);
            
        }
        else if(scoreB>scoreA){   //displaying if winner is second player
            System.out.printf(pr2+" wins with score = %d%n",scoreB);
        }
        else
            System.out.println("Draw");
    
        System.out.println("Do you want to play again? Y/N");
        choice=sc.next().toUpperCase().charAt(0);
        
        }while(choice=='Y');
        System.out.println("Thank You for playing!!");
    }
}
