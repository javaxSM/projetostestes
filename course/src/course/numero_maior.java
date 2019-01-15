package course;

import java.util.Scanner;

public class numero_maior {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter three numbers: ");
			int a = sc.nextInt(); 
			int b = sc.nextInt();
			int c = sc.nextInt();

			
			int result = max(a,b,c);
			
			showresult(result);
			
			sc.close();
	}
	
	public static int max(int x,int y,int z) {
		int aux;
		if(x > y && x > z) {
			aux = x;
		}
		else if(y > z) {
			aux = y;
		}
		else {
			aux =z;
		}
		return aux;
		
		
	}
	
	public static void showresult(int exibe) {
		System.out.println("maior = " + exibe);
	}

}
