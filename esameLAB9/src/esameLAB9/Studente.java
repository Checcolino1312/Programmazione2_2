package esameLAB9;

import java.io.*;
import java.util.*;

public class Studente {

		private int matricola;
		private String cognome;
		private String nome;
		private List<Esame> esami = new ArrayList<Esame>();
	
		public Studente(int matricola, String cognome, String nome, ArrayList<Esame> esami) {
			
			try{
				this.matricola = matricola;
				this.cognome = cognome;
				this.nome = nome;
				this.esami = esami;
			}catch(Exception e) {
				System.err.println("Errore");
			}

		}
		
		public void print() {
			System.out.println("matricola: " + this.matricola + "\ncognome: " + this.cognome + "\nnome: " + this.nome + "\n");
			/**
			 * Irrilevante poiché gli esami li stampo come thread attivi per cui non verranno stampati in ordine
			 */
			Collections.sort(esami);
			Iterator<Esame> itr = esami.iterator();
			while(itr.hasNext()) {
			  itr.next().stampaEsame();
				/*
				 * Per parte BONUS avvio ogni esame come Thread attraverso il metodo start() e implementando
				 * run() in Esame
				 */
				//itr.next().start();
			}
		}

}
