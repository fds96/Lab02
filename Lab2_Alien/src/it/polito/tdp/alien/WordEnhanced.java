package it.polito.tdp.alien;

import java.util.*;

public class WordEnhanced {
	
	private String alienWord;
	private List<String> translation;
	
	public WordEnhanced(String alienWord, String translation) {
		super();
		this.alienWord = alienWord;
		this.translation = new ArrayList<>();
		this.translation.add(translation);
		
	}
	
	public String getAlienWord() {
		return alienWord;
	}

	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}

	public List<String> getTranslation() {
		return translation;
	}

	public String toString() {
		String temp ="' ";
		for(String s : translation)
			temp+=s+" - ";
		temp=temp.substring(0, temp.length()-2);
		return temp+="'";
	}
	
	public void addTranslation(String translation) {
		this.translation.add(translation);
	}
	
	public boolean equals(String confronta) {
		if(confronta.compareTo(alienWord)==0)
			return true;
		else return false;
	}
	
}
