package NovakSosa;
import java.util.Scanner;

  public class Desafio01 {
	
	public static void main (String [] args) { 
		
		Scanner scanner = new Scanner (System.in);
		System.out.print(" Digite um número de 1 a 7: ");
		int numero = scanner.nextInt();
		
		String DiaSemana;
		
		switch (numero) {
		case 1:
			DiaSemana = "Domingo";
			break;
		case 2:
			DiaSemana = "Segunda";
			break;	
	    case 3:
	    	DiaSemana = "Terça";
	    	break;
	    case 4:
	    	DiaSemana = "Quarta";
	    	break;
	    	
	    case 5:
	    	DiaSemana = "Quinta";
	    	break;	
	    case 6:
	    	DiaSemana = "Sexta";
	    	break;
	    case 7:
	    	DiaSemana = "Sábado";
	    	break;
	    default:
	    	DiaSemana = "Dia Inválido";
	    	break;
		}	
		
		System.out.println("O dia da semana que corresponde ao número " + numero + " é "+ DiaSemana);
		scanner.close();
		}	
		}
