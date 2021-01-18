import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		String newLine = System.lineSeparator();

		// get read for the player to use keyboard

		Scanner scanInput = new Scanner(System.in);

		// play again String variable
		String playAgain = "";
		// game loop
		do {
			// create random number from 1 - 100
			int theNumber = 1 + (int) (Math.random() * 100);

			int usersGuess = 0;

			while (usersGuess != theNumber) {
				System.out.println("Guess a number between 1 and 100.");
				usersGuess = scanInput.nextInt();
				if (usersGuess < theNumber) {
					System.out.println(newLine + "Oops. " + usersGuess + " too low.");
				} else if (usersGuess > theNumber) {
					System.out.println(newLine + "Oops. " + usersGuess + " is too high.");
				} else
					System.out.println(usersGuess + " is correct!");
			} // end of while loop for guessing

			// ask player if play again
			// ask for 'y' to play again
			System.out.println(newLine + "Would you like to play again (y/n)?");
			playAgain = scanInput.next();
		} while (playAgain.equalsIgnoreCase("Y"));
	
		System.out.println("Thank you for playing");
	}
}
