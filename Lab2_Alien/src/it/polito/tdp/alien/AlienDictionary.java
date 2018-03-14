package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	private List<Word> parole;
	
	public AlienDictionary() {
		parole = new ArrayList<>();
	}

	public void addWord(String alienWord, String translation) {
		for(Word w : parole) {
			if(w.equals(alienWord)) {
				w.setTranslation(translation);
				return;
			}
		}
		parole.add(new Word(alienWord,translation));
	}
	
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
}
