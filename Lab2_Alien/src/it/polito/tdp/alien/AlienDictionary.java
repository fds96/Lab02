package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	private List<WordEnhanced> parole; //Per Word usare Word
	
	public AlienDictionary() {
		parole = new ArrayList<>();
	}

	public void addWord(String alienWord, String translation) {
		for(WordEnhanced w : parole) { //Per Word usare Word
			if(w.equals(alienWord)) {
				w.addTranslation(translation);
				return;
			}
		}
		parole.add(new WordEnhanced(alienWord,translation));
	}
	
	public String translateWord(String alienWord) {
		String temp = "";
		for(WordEnhanced w: parole) { //Per Word usare Word
			if(w.equals(alienWord)) {
				temp=w.toString();
				break;
			}
		}
		return temp;
	}
	
	/* Versione per Word
	 public String translateWord(String alienWord) {
		String temp = "";
		for(Word w: parole) {
			if(w.equals(alienWord)) {
				temp=w.getTranslation();
				break;
			}
		}
		return temp;
	}
	 */
}
