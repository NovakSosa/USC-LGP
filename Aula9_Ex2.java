package Aula9;

public class Exercicio2 {
	public static void main(String[] args) {
		String nomeCompleto = "Herbert Souza";
		String[] nomeArray = nomeCompleto.split(" ");
		System.out.println("Nome completo: " + nomeCompleto + 
						   "\nPrimeiro nome: " + nomeArray[0] +
						   "\nPrimeiro nome maiusculo: " + nomeArray[0].toUpperCase());
	}
}
