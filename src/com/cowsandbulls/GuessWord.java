package com.cowsandbulls;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessWord {
	
String word;
	
	public void readGuessWord(){
		
		System.out.println("Enter the Guess word:");
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
	    try {
			word = bufferRead.readLine().toUpperCase();
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
	}
	
	public String checkGuessWordLength(){
		
		while(word.length()!=4){
			System.out.println("Please enter only 4 letter word");
			readGuessWord();
		}
		
		return word;
	}

}
