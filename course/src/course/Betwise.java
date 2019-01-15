package course;

import java.util.Scanner;

public class Betwise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mask = sc.nextInt();
		int n =sc.nextInt();
		if ((n & mask)!=0) {
			System.out.println("6th bit is True!");
		}
		else {
			System.out.println("6th bit is False");
		}

		
		sc.close();
	}

}
