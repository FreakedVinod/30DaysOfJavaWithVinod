import java.util.*;
public class GymCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your months: ");
		int month = sc.nextInt();
		sc.close();
		int total = 0;
		
		if(month % 12 == 0) {
			total = (month / 12) * 15000;
		}
		else if(month % 9 == 0) {
			total = (month / 9) * 12000;
		}
		else if(month % 5 == 0) {
			total = (month / 5) * 9000;
		}
		else if(month % 3 == 0) {
			total = (month / 3) * 5000;
		}
		else {
			System.out.println("Error");
			return;
		}
		
		System.out.print("Total Fees: " + total);

	}

}
