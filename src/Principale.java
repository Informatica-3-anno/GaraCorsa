import java.util.Scanner;

public class Principale {

	
	public static void main(String[] args) {

		//
		// String[] classifica= new String[5];
		//
		String[] classifica = { "Pino", "Rino", "Tino", 
				                "Ada", "Pia", "Lia", "Anna", 
				                "Gino", "Franco", "Ugo"};
		
		Scanner sc=new Scanner(System.in);
		/*
		for(int i=0;i<classifica.length   ;i++) {
			System.out.println(
				"Inserisci il concorrente arrivato in pos: "+(i+1)); 
			classifica[i]=sc.nextLine();
		}
		*/
	
		System.out.println("Totale: "+classifica.length+" concorrenti");
		
		for(int i=0;i<3; i++) {
			System.out.println("Pos: "+(i+1)+" concorrente: "+classifica[i]);
		}
		
		System.out.println(classifica[classifica.length-1]+" e' arrivato ultimo");

	}

}
