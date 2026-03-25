import java.util.*;
public class NumberGuessingGame {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int randNumber = rand.nextInt(100);

		System.out.println("Random Number is generated. Guess the Number from (0 - 100).");
		
		int value;
		
		do {
			System.out.print("\nGuess the number: ");
			value = sc.nextInt();

			if(randNumber < value) {
				System.out.print("Too High");
			}
			else if(randNumber > value) {
				System.out.print("Too Low");
			}
			else {
				System.out.print("You Guessed the Number !!!");
			}

		}
		while(randNumber != value);
		sc.close();
	}

}
