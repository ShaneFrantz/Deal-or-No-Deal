import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class Game {

  List<Integer> cases = new ArrayList<Integer>();
  ArrayList<Double> prizes = new ArrayList<Double>();

  static boolean skip = false; //SET TO TRUE WHEN TESTING SO YOU DONT RESIDENTSLEEPER

  int flag = 0; //flag used for while loops to check when condition has been met
  int chosenCase = 0;
  Scanner scan = new Scanner(System.in);
  int caseToRemove;
  String dealStatement = "";
  double percentageOfEV = 0.15;
  String stayOrSwap = "";
  int currentOffer = 0;
  String previousOffers = "NONE";
  double finalPrize = 0;

  public void start() {

    cases.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26));

    prizes.add(0.01);
    prizes.add(1.00);
    prizes.add(5.00);
    prizes.add(10.00);
    prizes.add(25.00);
    prizes.add(50.00);
    prizes.add(75.00);
    prizes.add(100.00);
    prizes.add(200.00);
    prizes.add(300.00);
    prizes.add(400.00);
    prizes.add(500.00);
    prizes.add(750.00);
    prizes.add(1000.00);
    prizes.add(5000.00);
    prizes.add(10000.00);
    prizes.add(25000.00);
    prizes.add(50000.00);
    prizes.add(75000.00);
    prizes.add(100000.00);
    prizes.add(200000.00);
    prizes.add(300000.00);
    prizes.add(400000.00);
    prizes.add(500000.00);
    prizes.add(750000.00);
    prizes.add(1000000.00);


    System.out.println("What is your name?\n");
    String playerName = scan.nextLine();
    
    wait(1);
    Console.clearScreen();
    System.out.println("Hello " + playerName + "! This is Deal or No Deal!\n");
    
    wait(5);
    System.out.println("To play.. you will pick one case out of 26.\n");
    
    wait(5);
    System.out.println("Then, you will slowly reveal the dollar amounts from the cases you didn't choose and the bank will make you offers along the way!\n");
    
    wait(5);
    System.out.println("If you like the offer you see, it's a deal!\n");
    
    wait(5);
    System.out.println("However, if you think you still have a shot at the big bucks, it's no deal!\n");
    
    wait(6);
    System.out.println("Let's play Deal or No Deal!!");
    
    wait(6);
    Console.clearScreen();
    
    wait(2);
    System.out.println("Please pick a case between 1 and 26!\n");
    
    while (flag != 1) {
      chosenCase = scan.nextInt();
      if (!(chosenCase >= 1 && chosenCase <= 26))
        System.out.println("That is not a valid case. Please pick a case between 1 and 26.\n");
      else
        flag = 1;
    }

    flag = 0; //reset flag
    cases.remove(chosenCase - 1);

    
    wait(1);
    Console.clearScreen();
    
    wait(1);
    System.out.println("You have selected case #" + chosenCase + "! Let's get to playing!");
    
    wait(3);
    Console.clearScreen();

    removeCases(6);

    wait(2);
    System.out.println("The phone is ringing....\n");

    wait(2);
    System.out.println("It's the banker...\n");

    wait(2);
    System.out.println("He wants to offer you $" + getOffer(percentageOfEV) + " for whatever is inside of your case.\n");

    wait(6);
    isItDOND();

    if (dealStatement.equalsIgnoreCase("DEAL"))
      dealAccepted();
    else {
      percentageOfEV = 0.24;
      System.out.print("It's... NO DEAL!!!");
      previousOffers = ("$" + currentOffer);
      wait(4);
      Console.clearScreen();
      removeCases(5);
      
      wait(2);
      System.out.println("The phone is ringing again...\n");

      wait(2);
      System.out.println("This time...\n");

      wait(2);
      System.out.println("The banker wants to offer you...\n");

      wait(3);

      System.out.print("\n$" + getOffer(percentageOfEV) + "...");
      wait(6);
      Console.clearScreen();

      isItDOND();
      if (dealStatement.equalsIgnoreCase("DEAL"))
        dealAccepted();
      else {
        percentageOfEV = 0.34;
        System.out.print("It's... NO DEAL!!!");
        previousOffers = ("$" + currentOffer + "\n" + previousOffers);
        wait(4);
        Console.clearScreen();
        removeCases(4);

        wait(2);
        System.out.println("It's that time again...\n");

        wait(2);
        System.out.println("The banker is back...\n");

        wait(2);
        System.out.println("And he's offering you...\n");

        wait(3);

        System.out.print("\n$" + getOffer(percentageOfEV) + "...");
        wait(6);
        Console.clearScreen();

        isItDOND();
        if (dealStatement.equalsIgnoreCase("DEAL"))
          dealAccepted();
        else {
          percentageOfEV = 0.43;
          System.out.print("It's... NO DEAL!!!");
          previousOffers = ("$" + currentOffer + "\n" + previousOffers);
          wait(4);
          Console.clearScreen();
          removeCases(3);

          wait(2);
          System.out.println("The phone rings again...\n");

          wait(2);
          System.out.println("The banker said that you're getting on his nerves...\n");

          wait(2);
          System.out.println("He's now offering you...\n");

          wait(3);

          System.out.print("\n$" + getOffer(percentageOfEV) + "...");
          wait(6);
          Console.clearScreen();

          isItDOND();
          if (dealStatement.equalsIgnoreCase("DEAL"))
            dealAccepted();
          else {
            percentageOfEV = 0.525;
            System.out.print("It's... NO DEAL!!!");
            previousOffers = ("$" + currentOffer + "\n" + previousOffers);
            wait(4);
            Console.clearScreen();
            removeCases(2);

            wait(2);
            System.out.println("And for the 5th time... the telephone rings...\n");

            wait(2);
            System.out.println("The banker wants you out here...\n");

            wait(2);
            System.out.println("And for that reason he is offering you...\n");

            wait(3);

            System.out.print("\n$" + getOffer(percentageOfEV) + "...");
            wait(6);
            Console.clearScreen();

            isItDOND();
            if (dealStatement.equalsIgnoreCase("DEAL"))
              dealAccepted();
            else {
              percentageOfEV = 0.62;
              System.out.print("It's... NO DEAL!!!");
              previousOffers = ("$" + currentOffer + "\n" + previousOffers);
              wait(4);
              Console.clearScreen();

              wait(2);
              System.out.println("I would like to announce that you are now at the point in the game where you will be removing ONE case at a time...\n");

              wait(7);
              Console.clearScreen();
              System.out.print("Better pick carefully...");

              wait(3);
              Console.clearScreen();

              removeCases(1);

              wait(2);
              System.out.println("You know the drill by now...\n");

              wait(2);
              System.out.println("The banker is furious...\n");

              wait(2);
              System.out.println("The banker wants you out of here...\n");

              wait(2);
              System.out.println("And he thinks you might do it for...\n");

              wait(3);

              System.out.print("\n$" + getOffer(percentageOfEV) + "...");
              wait(6);
              Console.clearScreen();

              isItDOND();
              if (dealStatement.equalsIgnoreCase("DEAL"))
                dealAccepted();
              else {
                percentageOfEV = 0.715;
                System.out.print("It's... NO DEAL!!!");
                previousOffers = ("$" + currentOffer + "\n" + previousOffers);
                wait(4);
                Console.clearScreen();
                removeCases(1);

                wait(2);
                System.out.println("You just don't want to leave don't you...\n");

                wait(2);
                System.out.println("The banker is starting to get hungry...\n");

                wait(2);
                System.out.println("And he wants to get out of here giving you as little money as possible...\n");

                wait(2);
                System.out.println("The offer is...\n");

                wait(3);

                System.out.print("\n$" + getOffer(percentageOfEV) + "...");
                wait(6);
                Console.clearScreen();

                isItDOND();
                if (dealStatement.equalsIgnoreCase("DEAL"))
                  dealAccepted();
                else {
                  percentageOfEV = 0.81;
                  System.out.print("It's... NO DEAL!!!");
                  previousOffers = ("$" + currentOffer + "\n" + previousOffers);
                  wait(4);
                  Console.clearScreen();
                  removeCases(1);

                  wait(2);
                  System.out.println("The phone is ringing again...\n");

                  wait(2);
                  System.out.println("There's not much game left to play...\n");

                  wait(2);
                  System.out.println("But that doesn't mean that the banker still doesn't want you gone...\n");

                  wait(2);
                  System.out.println("The offer is...");

                  wait(4);

                  System.out.print("\n$" + getOffer(percentageOfEV) + "...");
                  wait(6);
                  Console.clearScreen();

                  isItDOND();
                  if (dealStatement.equalsIgnoreCase("DEAL"))
                    dealAccepted();
                  else {
                    percentageOfEV = 0.9;
                    System.out.print("It's... NO DEAL!!!");
                    previousOffers = ("$" + currentOffer + "\n" + previousOffers);
                    wait(4);
                    Console.clearScreen();

                    wait(2);
                    System.out.println("This is the last case you will pick for this game...\n");
                    wait(5);
                    Console.clearScreen();
                    
                    wait(2);
                    System.out.print("Choose it... wisely...");
                    wait(5);
                    Console.clearScreen();

                    removeCases(1);

                    wait(2);
                    System.out.println("The phone... is ringing...\n");

                    wait(2);
                    System.out.println("This is the final offer the banker will make you...\n");

                    wait(2);
                    System.out.println("And that offer is...");

                    wait(7);

                    System.out.print("\n$" + getOffer(percentageOfEV) + "...");
                    wait(6);
                    Console.clearScreen();

                    isItDOND();
                    if (dealStatement.equalsIgnoreCase("DEAL"))
                      dealAccepted();
                    else {
                      System.out.print("It's... NO DEAL!!!");
                      wait(4);
                      Console.clearScreen();
                      
                      wait(2);
                      System.out.println(playerName + "...\n");

                      wait(2);
                      System.out.println("You are down to the final two cases...\n");

                      wait(2);
                      System.out.println("And there is one question left to ask...\n");

                      wait(2);
                      System.out.println("Do you want to keep case #" + chosenCase + "...\n");

                      wait(2);
                      System.out.println("The case you chose at the beginning of the game...\n");

                      wait(2);
                      System.out.println("OR...\n");

                      wait(2);
                      System.out.println("Would you like to swap it for case #" + cases.get(0) + "...\n");

                      wait(7);

                      Console.clearScreen();
                      System.out.println("STAY OR SWAP\n");
                      System.out.println("Remaining Values: " + prizes + "\n");
                      while (flag != 1) {
                        stayOrSwap = scan.nextLine();
                        if (stayOrSwap.equalsIgnoreCase("STAY") || stayOrSwap.equalsIgnoreCase("SWAP"))
                          flag = 1;
                      }

                      Console.clearScreen();
                      wait(3);
                      System.out.println(playerName + "...\n");
                      wait(3);
                      if (stayOrSwap.equalsIgnoreCase("STAY"))
                        System.out.println("You have chosen to stay with your case...\n");
                      else {
                        chosenCase = cases.get(0);
                        System.out.println("You have chosen to swap cases...\n");
                      }
                      wait(3);
                      System.out.println("Your case...\n");
                      wait(3);
                      System.out.println("Number " + chosenCase + "...\n");
                      wait(2);
                      System.out.println("Contains...\n");

                      wait(6);
                      Console.clearScreen();

                      wait(2); 
                      // randomly choosing between one of the values in prizes
                      if (Math.random() < 0.5)
                        finalPrize = prizes.get(0);
                      else
                        finalPrize = prizes.get(1);
                      if (finalPrize == 0.01)
                        System.out.print("$0.01!");
                      else
                        System.out.print("$" + (int)(finalPrize) + "!");
                      wait(2);
                      System.out.print("\n\n\nThank you for playing!");
                    }
                  }
                }
              }
            }
          } 
        }
      }
    }
  }
  
  public static void wait(int seconds) {
    if ((!skip)) {
      try {
        Thread.sleep(seconds * (1000));
      }
      catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
      }
    }
  }
    
  public void removeCases(int casesToRemove) {
    
    int totalCases = casesToRemove;

    for (int i = 1; i <= totalCases; i++) {
      if (casesToRemove != 1)
        System.out.println("You have " + casesToRemove + " cases left to open! Please pick a case!\n\n");
      else
        System.out.println("You have 1 case left to open! Please pick a case!\n\n");
      System.out.print(cases + "\n\n" + prizes + "\n\n");
      while (flag != 1) { 
        caseToRemove = scan.nextInt();
        if (!(cases.contains(caseToRemove)))
          System.out.print("That is not a valid case.\n");
        else
          flag = 1;
      }

      Console.clearScreen();


      flag = 0; //reset
      cases.remove(Integer.valueOf(caseToRemove));

      wait(3);
      System.out.println("Case #" + caseToRemove + " contained $" + removeRandomPrize());
      casesToRemove--;
      wait(6);

      Console.clearScreen();
      wait(1);

    }
  }

  public double removeRandomPrize() {
    int randomIndex = (int)(Math.random() * prizes.size());
    return prizes.remove(randomIndex);
  }

  public int getOffer(double percentageOfEV) {

    double randomDeviation = 1 + (((Math.random() * 15) - 7)/100); //generates random deviation between -7% and 7%

    currentOffer = (int)((getMeanOfPrizes() * percentageOfEV) * randomDeviation);

    return currentOffer;

  }

  public double getMeanOfPrizes() {
    double sum = 0;
    for (int i = 0; i < prizes.size(); i++)
      sum += prizes.get(i);
    return sum/prizes.size();
  }

  public void dealAccepted() {
    System.out.print("It's a Deal!\n\nCongratulations! You have won $" + currentOffer + "!\n\n\nThank you for playing!");
  }
  
  public void isItDOND() {
    while (flag != 1) {
    System.out.println("Is it DEAL or NO DEAL?\n");
    System.out.println("Offer: $" + currentOffer + "\n");
    System.out.println("Previous Offers:\n\n" + previousOffers + "\n");
    System.out.println("Remaining Values: " + prizes + "\n");
    dealStatement = scan.nextLine();
    if (dealStatement.equalsIgnoreCase("DEAL") || dealStatement.equalsIgnoreCase("NO DEAL"))
      flag = 1;
    else
      Console.clearScreen();
    }

    Console.clearScreen();
    flag = 0; //reset
  }
}