import java.io.IOException;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*Task 2: Explain the rules

        >>Let's play Pokerito. Type anything when you're ready.
        |
        >>It's like Poker, but a lot simpler.
        >> (new line)
        >> • There are two players, you and the computer.
        >> • The dealer will give each player one card.
        >> • Then, the dealer will draw five cards (the river)
        >> • The player with the most river matches wins!
        >> • If the matches are equal, everyone's a winner!
        >> (new line)
        >> • Ready? Type anything if you are.
        |
        */
        System.out.println("Let's play Pokerito. Type anything when you;re ready.");
        String ready = scan.nextLine();
        System.out.println(">>It's like Poker, but a lot simpler.\n");
        System.out.println(">> • There are two players, you and the computer.");
        System.out.println(">> • The dealer will give each player one card.");
        System.out.println(">> • Then, the dealer will draw five cards (the river)");
        System.out.println(">> • The player with the most river matches wins!");
        System.out.println(">> • If the matches are equal, everyone's a winner!\n");
        System.out.println(">> • Ready? Type anything if you are.");
        String ready2 = scan.nextLine();

        /*Task 3: Present the user with a card
         println 'Here's your card:'
         <show card>
         <new line>
         println 'Here's the computer's card:'
         <show computer's card>
        */
        System.out.println("Here's your card: ");
        String yourCard = randomCard();
        System.out.println(yourCard);
        System.out.println("Here's the computer's card: ");
        String computerCard = randomCard();
        System.out.println(computerCard);

        int yourMatches = 0;
        int computerMatches =0;

        /** Task 4 - Draw five cards
         * 
         * • print:  Now, the dealer will draw five cards. Press enter to continue.
         * • The dealer will draw a card every time the user presses enter.
         * • Before you draw a card, print the order it was drawn in:
         *      Card 1 
         *      <2 new lines>
         *      <print card>
         *      Card 2
         *      <2 new lines>
         *      <print card>
         *      ...
         */
        System.out.println("Now, the dealer will draw five cards. press enter to continue.");

        for(int i = 1; i <= 5; i++)
        {
          String dealerCard = "";
          try{
            System.in.read();
            System.out.println("Card " + i);
            System.out.println();
            System.out.println();
            System.out.println(dealerCard = randomCard());
            if(yourCard.equals(dealerCard))
        {
          yourMatches =+ 1;
        }
        else if(computerCard.equals(dealerCard))
        {
          computerMatches =+ 1;
        }
          } catch(IOException e){
            e.printStackTrace();
  
          }

        }

        /** Task 5 - Get the winner
         * 
         * • Count your number of matches.
         * • Count the computer's number of matches.
         * • print: Your number of matches: <yourMatches>
         * • print: Computer number of matches:  <computerMatches>
         * 
         * • If you have more matches, print: You win!. 
         * • If the computer has more matches, print: The computer wins! 
         * • If the matches are equal, print: everyone wins!.
         */
        System.out.println("Your number of matches: " + yourMatches);
        System.out.println("Computer number of matches: " + computerMatches);

        if(yourMatches > computerMatches){
          System.out.println("You win!");
        }
        else if(computerMatches > yourMatches){
          System.out.println("The computer wins!");
        }
        else if(yourMatches == computerMatches)
        {
          System.out.println("Everyone wins!");
        }


         scan.close();
    }

    /** Task 1
     * 
     * Function name – randomCard
     * @return (String)
     * 
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card that matches the random number (get the String values from cards.text).   
     */

     public static String randomCard()
     {
      String randCard = "";
      int max = 14;
      int min = 1;
      int number = (int)(Math.random() * (max - min)) + min;

      switch(number){
        case 1: 
        String card1 = "   _____\n"+
        "  |A _  |\n"+ 
        "  | ( ) |\n"+
        "  |(_'_)|\n"+
        "  |  |  |\n"+
        "  |____V|\n";
        randCard = card1;
        break;

        case 2: 
        String card2 = "   _____\n"+              
        "  |2    |\n"+ 
        "  |  o  |\n"+
        "  |     |\n"+
        "  |  o  |\n"+
        "  |____Z|\n";
        randCard = card2;
        break;

        case 3:
        String card3 = "   _____\n" +
        "  |3    |\n"+
        "  | o o |\n"+
        "  |     |\n"+
        "  |  o  |\n"+
        "  |____E|\n";
        randCard = card3;
        break;

        case 4:
        String card4 = "   _____\n" +
        "  |4    |\n"+
        "  | o o |\n"+
        "  |     |\n"+
        "  | o o |\n"+
        "  |____h|\n";
        randCard = card4;
        break;

        case 5:
        String card5 = "   _____ \n" +
        "  |5    |\n" +
        "  | o o |\n" +
        "  |  o  |\n" +
        "  | o o |\n" +
        "  |____S|\n";
        randCard = card5;
        break;

        case 6:
        String card6 = "   _____ \n" +
        "  |6    |\n" +
        "  | o o |\n" +
        "  | o o |\n" +
        "  | o o |\n" +
        "  |____6|\n";
        randCard = card6;
        break;

        case 7:
        String card7 = "   _____ \n" +
        "  |7    |\n" +
        "  | o o |\n" +
        "  |o o o|\n" +
        "  | o o |\n" +
        "  |____7|\n";
        randCard = card7;
        break;

        case 8:
        String card8 = "   _____ \n" +
        "  |8    |\n" +
        "  |o o o|\n" +
        "  | o o |\n" +
        "  |o o o|\n" +
        "  |____8|\n";
        randCard = card8;
        break;

        case 9:
        String card9 = "   _____ \n" +
        "  |9    |\n" +
        "  |o o o|\n" +
        "  |o o o|\n" +
        "  |o o o|\n" +
        "  |____9|\n";
        randCard = card9;
        break;

        case 10:
        String card10 = "   _____ \n" +
        "  |10  o|\n" +
        "  |o o o|\n" +
        "  |o o o|\n" +
        "  |o o o|\n" +
        "  |___10|\n";
        randCard = card10;
        break;

        case 11:
        String card11 =  "   _____\n" +
        "  |J  ww|\n"+ 
        "  | o {)|\n"+ 
        "  |o o% |\n"+ 
        "  | | % |\n"+ 
        "  |__%%[|\n";
        randCard = card11;
        break;

        case 12:
        String card12 = 
        "   _____\n" +
        "  |Q  ww|\n"+ 
        "  | o {(|\n"+ 
        "  |o o%%|\n"+ 
        "  | |%%%|\n"+ 
        "  |_%%%O|\n";
        randCard = card12;
        break;

        case 13:
        String card13 = "   _____\n" +
        "  |K  WW|\n"+ 
        "  | o {)|\n"+ 
        "  |o o%%|\n"+ 
        "  | |%%%|\n"+ 
        "  |_%%%>|\n";
        randCard = card13;
        break;

      }
      return randCard;

      /*if(number == 1)
      {
        String card1 = "   _____\n"+
        "  |A _  |\n"+ 
        "  | ( ) |\n"+
        "  |(_'_)|\n"+
        "  |  |  |\n"+
        "  |____V|\n";

        randCard = card1;
      }
      else if(number == 2)
      {
        String card2 = "   _____\n"+              
        "  |2    |\n"+ 
        "  |  o  |\n"+
        "  |     |\n"+
        "  |  o  |\n"+
        "  |____Z|\n";

        randCard = card2;

      }
      else if(number == 3)
      {
        String card3 = "   _____\n" +
        "  |3    |\n"+
        "  | o o |\n"+
        "  |     |\n"+
        "  |  o  |\n"+
        "  |____E|\n";

        randCard = card3;
        
      }
      else if(number == 4)
      {
        String card4 = "   _____\n" +
        "  |4    |\n"+
        "  | o o |\n"+
        "  |     |\n"+
        "  | o o |\n"+
        "  |____h|\n";

        randCard = card4;
        
      }
      else if(number == 5)
      {
        String card5 = "   _____ \n" +
        "  |5    |\n" +
        "  | o o |\n" +
        "  |  o  |\n" +
        "  | o o |\n" +
        "  |____S|\n";

        randCard = card5;
        
      }
      else if(number == 6)
      {
        String card6 = "   _____ \n" +
        "  |6    |\n" +
        "  | o o |\n" +
        "  | o o |\n" +
        "  | o o |\n" +
        "  |____6|\n";

        randCard = card6;
        
      }
      else if(number == 7)
      {
        String card7 = "   _____ \n" +
        "  |7    |\n" +
        "  | o o |\n" +
        "  |o o o|\n" +
        "  | o o |\n" +
        "  |____7|\n";

        randCard = card7;
        
      }
      else if(number == 8)
      {
        String card8 = "   _____ \n" +
        "  |8    |\n" +
        "  |o o o|\n" +
        "  | o o |\n" +
        "  |o o o|\n" +
        "  |____8|\n";

        randCard = card8;
        
      }
      else if(number == 9)
      {
        String card9 = "   _____ \n" +
        "  |9    |\n" +
        "  |o o o|\n" +
        "  |o o o|\n" +
        "  |o o o|\n" +
        "  |____9|\n";

        randCard = card9;
        
      }
      else if(number == 10)
      {
        String card10 = "   _____ \n" +
        "  |10  o|\n" +
        "  |o o o|\n" +
        "  |o o o|\n" +
        "  |o o o|\n" +
        "  |___10|\n";

        randCard = card10;
        
      }
      else if(number == 11)
      {
        String card11 =  "   _____\n" +
        "  |J  ww|\n"+ 
        "  | o {)|\n"+ 
        "  |o o% |\n"+ 
        "  | | % |\n"+ 
        "  |__%%[|\n";

        randCard = card11;
        
      }
      else if(number == 12)
      {
        String card12 = 
        "   _____\n" +
        "  |Q  ww|\n"+ 
        "  | o {(|\n"+ 
        "  |o o%%|\n"+ 
        "  | |%%%|\n"+ 
        "  |_%%%O|\n";

        randCard = card12;
        
      }
      else if(number == 13)
      {
        String card13 = "   _____\n" +
        "  |K  WW|\n"+ 
        "  | o {)|\n"+ 
        "  |o o%%|\n"+ 
        "  | |%%%|\n"+ 
        "  |_%%%>|\n";

        randCard = card13;
        
      }
      return randCard; */
      
    }

}
