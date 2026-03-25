import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int[] arr = new int [size];
		
		for(int i = 0; i < size; i++ ) {
			System.out.print("Enter the element " + (i+1) + " : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\nArray elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println("\nSelect the target: ");
        int target = sc.nextInt();
		
        sc.close();
		
        for(int i = 0; i < size; i++) {
        	if(arr[i] == target) {
        		System.out.println("The Index value of the target element is: " + i);
        	}
        }
	}

}
