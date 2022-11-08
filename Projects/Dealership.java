package Dealership_Project;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Dealership {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to the Java Dealership!");
    System.out.println("--> Select option 'a' to sell a car.");
    System.out.println("--> Select option 'b' to buy a car.");

    String option = scan.nextLine();
    switch (option){

      case "a":
      System.out.println("What is your budget?");
      int budge = scan.nextInt();
      if(budge >= 10000)
      {
        System.out.println("Great! A Nissan Altima is avaliable.");
        System.out.println("\nDo you have insurance? 'yes' or 'no' ");
        scan.nextLine();
        String insurance = scan.nextLine();

        System.out.println("\nDo you have a drivers licences? 'yes' or 'no' ");
        String licences = scan.nextLine();

        System.out.println("\nWhat is your credit score?");
        int credit = scan.nextInt();

        if(insurance.equals("yes") && licences.equals("yes") && credit > 660)
        {
          System.out.println("Sold! Pleasure doing business with you.");

        }
        else
        {
          System.out.println("We're sorry! You're not eligible. :(");
        }



      }
      else
      {
        System.out.println("Sorry! We don;t sell cars under 10,000.");
      }
      
      break;
      case "b":System.out.println("\nWhat is your car valued at?");
      int value = scan.nextInt();
      System.out.println("\nWhat is your selling price?");
      int selling = scan.nextInt();

      if(value > selling && selling < 30000)
      {
        System.out.println("\nWe'll buy your car! Pleasure doing business with you.");
      }
      else{
        System.out.println("\nSorry, we're not interested. :P");
      }

      break;
      default: System.out.println("Invalid option.");
      scan.close();
    }
  }
}
