import java.util.*;

public class PasswordStrengthChecker {
	
	public static boolean passwordChecker(String str) {
		if(str == null || str.length() < 8) {
			return false;
		}
		
		boolean hasUpper = false;
		boolean hasLower = false;
		boolean hasDigit = false;
		
		for(char c : str.toCharArray()) {
			if(Character.isUpperCase(c)) {
				hasUpper = true;
			}
			else if(Character.isLowerCase(c)) {
				hasLower = true;
			}
			else if(Character.isDigit(c)) {
				hasDigit = true;
			}
			
			if(hasUpper && hasLower && hasDigit) { // If the conditions are met early than expected and within the iteration.
				return true;
			}
		}
			
		return hasUpper && hasLower && hasDigit;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("/-------------------------/");
		System.out.print("\nRule: Minimum Length = 8\nAtleast 1 Uppercase\nAtleast 1 Lowercase\nAtleast 1 Digit.\n");
		System.out.print("/-------------------------/");
		System.out.print("\nEnter the password: ");
		String password = scanner.nextLine();
		boolean passwordIsStrong = passwordChecker(password);

		while(!passwordIsStrong) {
		
			System.out.print("\nPassword is weak.");
			System.out.print("\nEnter a new one: ");
			password = scanner.nextLine();
			
			passwordIsStrong = passwordChecker(password);
		
		}
		if(passwordIsStrong) {
			System.out.print("Password Confirmed.");
		}
		
		scanner.close();
	}
	
}