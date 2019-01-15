package course;

import java.util.Locale;
import java.util.Scanner;

import Entities.IMC;

public class Abacaxi_descubra {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		IMC a,b;
		a = new IMC();
		b = new IMC();
		
		System.out.println("Digite se nome: ");
		nome = sc.nextLine();
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		System.out.println("Digite sua altura: ");
		a.altura = sc.nextDouble();
		System.out.println("Digite seu peso: ");
		b.peso = sc.nextDouble();
		
		double result = b.peso / (a.altura * a.altura);
		
		if (result <= 18) {
			System.out.println("Magro!");
		}
		else if (result >= 18 && result <= 24) {
			System.out.println("Normal!");
		}
		else if (result >= 25 && result <= 30) {
			System.out.println("Sobrepeso!");
		}
		System.out.println("Seu nome é: " + nome);
		System.out.println("Seu idade é: " + idade);
		System.out.println("Seu sua é: " + a.altura);
		System.out.println("Seu peso é: " + b.peso);
		System.out.printf("Seu IMC é %.2f " , result);
		
		sc.close();

	}

}
