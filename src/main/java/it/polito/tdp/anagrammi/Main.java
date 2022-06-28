package it.polito.tdp.anagrammi;

public class Main {
	public static void main(String[] args) {
		//EntryPoint.main(args);
		anagramma("ciao");
	}

	public static void anagramma(String s) {
		anagramma_ricorsivo("", 0, s);
	}

	public static void anagramma_ricorsivo(String parziale, int livello, String rimanenti) {
		
		if(rimanenti.length() == 0) {
			System.out.println(parziale);
			return;
		}
		
		for(int i = 0; i<rimanenti.length(); i++ )  {
			anagramma_ricorsivo(parziale+rimanenti.charAt(i), livello+1, rimanenti.substring(0, i)+rimanenti.substring(i+1));
		}
		
	}

}
