/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevens.botekd;

/**
 *
 * @author botekd
 */
public class CardTester {
    public static void main(String[] args){
        
        Card x = new Card("king", "clubs", 13);
        
        System.out.println("My card is ranked " + x.rank());
        System.out.println("My card has the suit: " + x.suit());
        System.out.println("My card has the value: " + x.pointValue());
        
        
        Card y = new Card("king", "clubs", 13);
      
        System.out.println("My card is ranked " + y.rank());
        System.out.println("My card has the suit: " + y.suit());
        System.out.println("My card has the value: " + y.pointValue());
        System.out.println("This should be true: " + y.matches(y));
        
        Card z = new Card("cupcake", "small", 40);
       
        System.out.println("My card is ranked " + z.rank());
        System.out.println("My card has the suit: " + z.suit());
        System.out.println("My card has the value: " + z.pointValue());
    }
}
