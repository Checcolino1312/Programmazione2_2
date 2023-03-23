package esameLAB9;

import java.io.Serializable;

public class Esame extends Thread implements Comparable<Esame>{
	private String nome;
	private int voto;
	
	public Esame(String nome, int voto) {
		this.nome = nome;
		this.voto = voto;
	}
	
	public void stampaEsame() {
		System.out.println(this.nome + ": " + this.voto);
	}

	public void run() {
		this.stampaEsame();
	}
	
	@Override
	public int compareTo(Esame esame) {
		if(esame.voto > this.voto) {
			return 1;
		}
		else if(esame.voto < this.voto) {
			return -1;
		}
		else 
			return 0;
	}
	
}

