package aula7;

import java.util.Scanner;

public class Desafio2 {
		public static void main(String [] args) {
			try (Scanner scan = new Scanner(System.in)) {
				System.out.println("Digite sua nota: ");
				float nota = scan.nextFloat();
				
				if (nota >= 70 && nota >= 90) {
					System.out.println("APROVADO! Parabéns!");
				}
				else if (nota >= 70)  {
					System.out.println("APROVADO!");
				}
				else {
					System.out.println("REPROVADO");
				}
			}	
		}
}
