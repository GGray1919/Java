import java.util.Scanner;

public class DiceJack {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int roll1 = rollDice();
    int roll2 = rollDice();
    int roll3 = rollDice();
    
    System.out.println("Enter three numbers between 1 - 6.");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int num3 = scan.nextInt();

    if(num1 < 1 || num2 < 1 || num3 < 1)
    {
      System.out.println("Numebrs cannot be less than 1. Shutting the game down.");
      System.exit(0);
    }
    if(num1 > 6 || num2 > 6 || num3 > 6)
    {
      System.out.println("Numebrs cannot be greater than 6. Shutting game down.");
      System.exit(0);
    }

    int sumOfNums = num1 + num2 + num3;
    int sumOfDiceRolls = roll1 + roll2 + roll3;
    System.out.println("Dice sum: " + sumOfDiceRolls + "\nNumber sum: " + sumOfNums);

    if(checkWin(sumOfDiceRolls, sumOfNums)){
      System.out.println("Congrats! You win! :D");
    }
    else{
      System.out.println("Sorry! You lose. :(");
    }

    scan.close();

  }

  public static int rollDice()
  {
                      // between 0 - .9999999999
    double randomNum = Math.random() * 6; // 0 - 5.9999999999
    randomNum += 1; // 1 - 6.99999999999
    return (int)randomNum; // 1 - 6
  }
  
  public static boolean checkWin(int sumOfDiceRolls, int sumOfNums)
  {
    return(sumOfNums > sumOfDiceRolls && sumOfNums - sumOfDiceRolls > 3);
  }
}
