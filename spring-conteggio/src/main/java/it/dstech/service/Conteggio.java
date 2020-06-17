package it.dstech.service;

public class Conteggio {
	private String testo;

	public Conteggio(String testo) {
		this.testo = testo;
	}
	public int contaParole() {
		int contatore = 0;
		for (int i = 0; i < testo.length(); i++) {
			if(testo.charAt(i) == ' ' && testo.charAt(i+1) != ' ') {
				contatore ++;
			}
		}
		return contatore + 1;
	}
	public int contaVocali() {
		int contatore = 0;
		for (int i = 0; i < testo.length(); i++) {
			if(testo.charAt(i) == 'a' || testo.charAt(i) == 'e' ||testo.charAt(i) == 'i' ||testo.charAt(i) == 'o' ||testo.charAt(i) == 'u') {
				contatore ++;
			}
		}
		return contatore;
	}
	public int contaConsonanti() {
		int contatore = 0;
		for (int i = 0; i < testo.length(); i++) {
			if(!(testo.charAt(i) == 'a' || testo.charAt(i) == 'e' ||testo.charAt(i) == 'i' ||testo.charAt(i) == 'o' ||testo.charAt(i) == 'u') && testo.charAt(i) != ' ') {
				contatore ++;
			}
		}
		return contatore;
	}
}
