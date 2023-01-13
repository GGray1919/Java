import java.io.IOException;
import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        //Task 3 – Wait for the user to press enter.
        try {
          System.in.read();
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }

        //Task 4 – Get two random cards.
        //       – Print them: \n You get a \n" + <randomCard> + "\n and a \n" + <randomCard>
        int cardNum1 = drawRandomCard();
        int cardNum2 = drawRandomCard();
        String card1 = cardString(cardNum1);
        String card2 = cardString(cardNum2);

        System.out.println("\nYou get a " + card1 + " \n and a \n" + card2);
        System.out.println("Card #1: " + cardNum1 + " Card #2: " + cardNum2);

        //Task 5 – Print the sum of your hand value.
        //       – print: your total is: <hand value>

        int handValue = 0;

        if(cardNum1 > 10)
        {
          cardNum1 = 10;
          if(cardNum2 > 10)
          {
            cardNum2 = 10;
          }
        }
        else if(cardNum2 > 10)
        {
          cardNum2 = 10;
        }
          handValue = cardNum1 + cardNum2;


        System.out.println("Your total is: " + handValue);
        
        //Task 6 – Get two random cards for the dealer.
        //       – Print: The dealer shows \n" + <first card> + "\nand has a card facing down \n" + <facedown card>
        //       – Print: \nThe dealer's total is hidden

        int dealerCardNum1 = drawRandomCard();
        int dealerCardNum2 = drawRandomCard();
        String dealerCard1 = cardString(dealerCardNum1);
        String dealerCard2 = cardString(dealerCardNum2);
        String dealerCardDown = "   _____\n"+
        "  |     |\n"+ 
        "  |     |\n"+
        "  |     |\n"+
        "  |     |\n"+
        "  |____ |\n"; 

        int dealerHandValue = 0;

        if(dealerCardNum1 > 10)
        {
          dealerCardNum1 = 10;
          if(dealerCardNum2 > 10)
          {
            dealerCardNum2 = 10;
          }
        }
        else if(dealerCardNum2 > 10)
        {
          dealerCardNum2 = 10;
        }
          dealerHandValue = dealerCardNum1 + dealerCardNum2;

        System.out.println("The dealer shows \n" + dealerCard1 + "\nand has a card facing down \n" + dealerCardDown);
        System.out.println("\nThe dealer's total is hidden.");

       
        //Task 8 – Keep asking the player to hit or stay (while loop).
        //       1. Every time the player hits
        //             – draw a new card.
        //             – calculate their new total.
        //             – print: (new line) You get a (new line) <show new card>.
        //             - print: your new total is <total>

        //       2. Once the player stays, break the loop. 

        //boolean hit = true;
        String skip = scan.nextLine();
        String answer = " ";

          while(true)
          {
            System.out.println("hit or stay?");
            answer = scan.nextLine();
            if(!(answer.equals("hit") || answer.equals("stay")))
            {
              System.out.println("Please write 'hit' or 'stay' ");
             continue;
            }
            else if(answer.equals("stay"))
            {
             break;
            }
            else if(answer.equals("hit"))
            {
              int newCardNum = drawRandomCard();
              String newCard = cardString(newCardNum);
              if(newCardNum > 10)
              {
               newCardNum = 10;
              }
              handValue += newCardNum;

              System.out.println("\nYou get a \n" + newCard);
              System.out.println("Your new total is " + handValue);

              if(handValue > 21)
              {
                System.out.println("Bust! Player loses");
                System.exit(0);

              }

            }

          }

          //Task 10

          System.out.println("Dealer's turn!");
          System.out.println("The dealer's cards are \n" + dealerCard1 + "\nand a \n" + dealerCard2);
          System.out.println("\nThe dealer's new total is: " + dealerHandValue);
          
          //Task 11

          while(dealerHandValue < 17)
          {
            int dealerNewCardNum = drawRandomCard();
            String dealerNewCard = cardString(dealerNewCardNum);
            if(dealerNewCardNum > 10)
            {
              dealerNewCardNum = 10;
            }
            dealerHandValue += dealerCardNum2;

            System.out.println("\nThe dealer gets a \n" + dealerNewCard);
            System.out.println("The dealer's new total is " + dealerHandValue);

          }

          if(dealerHandValue > 21)
          {
            System.out.println("Bust! Dealer loses");
            System.exit(0);
          }
          
          else if(dealerHandValue > handValue)
          {
            System.out.println("Dealer wins!");
            System.exit(0);
          }
          else if(dealerHandValue < handValue)
          {
            System.out.println("You win!");
            System.exit(0);
          }         
        //}

        
        //For tasks 9 to 13, see the article: Blackjack Part II. 
         scan.close();

    }

    /** Task 1 – make a function that returns a random number between 1 and 13
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */
    public static int drawRandomCard()
    {
      int max = 14;
      int min = 1;
      int number = (int)(Math.random() * (max - min)) + min;

      return number;

    }


    /** Task 2 – make a function that returns a String drawing of the card.
     * Function name – cardString
     * @param cardNumber (int)
     * @return (String)
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */

     public static String cardString(int number)
     {
      String randCard = "";
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

     }

    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    
    /** Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option 
     */
    /*public static String hitOrStay()
    {
      System.out.println("Hit or stay?");
      String answer = scan.nextLine();
      while(true)
      {
      if(!(answer.equals("hit") || answer.equals("stay")))
            {
              System.out.println("Please write 'hit' or 'stay' ");
              continue;
            }
            break;
      }
      return answer;

    }*/
