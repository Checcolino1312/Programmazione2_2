package esameLAB9;
import java.io.*;
import java.util.*;

public class Lab {
	
	public static void main(String[] args) throws IOException { 
		// 1. inserimento dati studente (PROVA BASE)
		Studente studente = inserimento();
		System.out.println("fine inserimento\n");
			
		// 2. stampa studente (PROVA BASE/PROVA BONUS)
		studente.print();
			 
		System.out.println("\nfine programma");
		
	}
	
	
	public static Studente inserimento() throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int matricola = 0, votoEsame = 0;
		String nome = "", cognome = "", nomeEsame = " ";
		ArrayList<Esame> esami = new ArrayList<Esame>();
		
		
		
			System.out.println("matricola:");
			matricola = Integer.parseInt(in.readLine());
			
			
			System.out.println("cognome:");
			cognome = in.readLine();
			
			System.out.println("nome:");
			nome = in.readLine();
			
			while(nomeEsame.length() != 0) {
				System.out.println("nome esame: ");
				nomeEsame = in.readLine();
				if(nomeEsame.length() != 0) {
						System.out.println("voto esame: ");
						votoEsame = Integer.parseInt(in.readLine());
						esami.add(new Esame(nomeEsame, votoEsame));
				}
			} // end while			
		
		return new Studente(matricola, cognome, nome, esami);
	} // end inserimento()

	
}
