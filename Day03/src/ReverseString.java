import java.util.Scanner;

public class ReverseString {

	public static String reverse(String str) {
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
		
		return new String (charArray);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String original = scanner.nextLine();
		
		scanner.close();
		
		System.out.print("Original: " + original);
		System.out.print("\nReversed: " + reverse(original));
	}

}
