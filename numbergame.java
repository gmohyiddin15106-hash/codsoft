import java.util.Random;
import java.util.Scanner;

public class numbergame{
    private static int totalScore = 0;
    private static int roundsWon = 0;
    private static final int MAX_ATTEMPTS = 5;


public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    boolean playAgain = true;
    int roundNumber = 1;

    System.out.println("!!!!Welcom to NumberGame!!!!");
    System.out.println("***Guess (1 - 100)***");

    while (playAgain) {
        System.out.println("\n--- Round " + roundNumber + "---");
        int secretNumber = random.nextInt(100) + 1;
        int attemptsLeft = MAX_ATTEMPTS;
        boolean guessedCorrectly = false;

        while (attemptsLeft > 0){
            System.out.println("attemptsleft: " + attemptsLeft);
            System.out.print("Enter your guess :");

            int guess;

            try {
                guess = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e){
                System.out.println("! please Enter a valid Number");
                continue ;
            }
            if(guess < 1 || guess > 100) {
                System.out.println("please Enter number between  1 - 100 ");
                continue;
            }
            attemptsLeft--;

            if (guess == secretNumber) {
                int pointsEarned = attemptsLeft * 10 + 10;
                totalScore += pointsEarned;
                roundsWon++;
                guessedCorrectly = true;
                System.out.println("!CURRECT! the number was"+secretNumber);
                System.out.println("your earned " + pointsEarned+"points!!");
                break;
                } else if(guess < secretNumber){
                    System.out.println("Too Low!! Try little Higher!!");
                }else{
                    System.out.println("Too High!! Try little lower!!");
                }
        }
        if(!guessedCorrectly){
            System.out.println("out of attemps !! the number was"+ secretNumber);
        }
        System.out.print("\n Score so far:"+totalScore+"Roundswon"+ roundsWon+"/"+roundNumber);
        System.out.print("\n Play Another Round? (yes/NO):");
        String response = scanner.nextLine().trim().toLowerCase();
        playAgain = response.equals("yes")||response.equals("y");
        roundNumber++;
    }
    System.out.println(" !--- GAME OVER ---!");
    System.out.println("Total Rounds:"+(roundNumber-1)+"   ");
    System.out.println("RoundsWon:"+roundsWon+"  ");
    System.out.println("Final Score:"+totalScore+"  ");
    System.out.println("Game Over Well Played! ");
    scanner.close();
}
}
     
            
                
            


            

            
            
    

        

    


