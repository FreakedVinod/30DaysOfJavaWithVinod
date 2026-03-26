import java.util.Scanner;

public class PalindromeChecker {
	
	public static String Palindrome(String str) {
		if(str == null || str.isEmpty()) {
			return str;
		}
		
		char[] charArray = str.toCharArray();
		int left = 0;
		int right = charArray.length - 1;
		
		while(left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			
			left ++;
			right --;
		}
		
		return new String(charArray);
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the String to check if it is Palindrome or not: ");
		String word = scanner.nextLine();
		
		String reversed = Palindrome(word);
		
		System.out.print("Your word is: " + word);
		
		
		if(word.equalsIgnoreCase(reversed)) {
			System.out.println("\nIt is a Palindrome.");
		}
		else {
			System.out.print("\nIt is not a Palindrome.");
		}
		
		scanner.close();
	}

}
