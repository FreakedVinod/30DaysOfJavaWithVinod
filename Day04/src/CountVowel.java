import java.util.*;
public class CountVowel {

	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
				
		System.out.print("Enter the string to check the number of vowels in it: ");
		String stringVariable = scanner.nextLine().toLowerCase();
		
		scanner.close();
		
		char [] charArray = stringVariable.toCharArray();
		int size = stringVariable.length();
		int countVowel = 0;
		int countConsonant = 0;
		
		
		for(int i = 0; i < size; i++) {
			
			if(Character.isLetter(charArray[i])) {
				
				if(charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u') {
					countVowel++;
				}
				else {
					countConsonant++;
				}
			}
			
		}
		
		System.out.println("Number of Vowels: " + countVowel);
		System.out.println("Number of Consonant: " + countConsonant);
	}

}
