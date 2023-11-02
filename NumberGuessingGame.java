package motioncut;
import java.util.Scanner;
import java.lang.Math;
public class NumberGuessingGame {
	public static void main(String[] args) {
		int guessedNumber = (int)(Math.random()*100)+1;
		int trials=100;
		int totaltrials=100;
		Scanner input=new Scanner(System.in);
		System.out.println("Let's play a game guess a number between 1 to 100. \n You have 5 tries to guess the correct number.");
		while(trials >0)
		{
			System.out.println("Enter Your guess: ");
			int userGuess = input.nextInt();
			if (userGuess == guessedNumber)
			{
				System.out.println("Wow! you guessed the correct number!\n You win!");
				System.out.println("you guessed the number of "+(totaltrials-(trials-1))+"  trials.");
				break;
			}
			else if(userGuess>guessedNumber)
			{
				System.out.println("your guess is too high.\n Keep trying!");
				trials--;
			}
			else
			{
				System.out.println("your guess is too low.\n Keep trying!");
				trials--;
			}
			
			}
		
	}
}
