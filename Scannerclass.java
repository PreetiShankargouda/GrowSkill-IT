package strings;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name");
		
		String name = sc.nextLine();
		System.out.println("So your name is: " +name);
		sc.close();

	}

}
