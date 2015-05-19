package com.cowsandbulls;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class OriginalWord {

	String word;
	
	public void readOriginalWord(){
		
		
		System.out.println("Enter the Original word:");
		
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
	    try {
			word = bufferRead.readLine().toUpperCase();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	   
	}
	
	public String checkOriginalWordLength(){
		
		while(word.length()!=4){
			System.out.println("Please enter only 4 letter word");
			readOriginalWord();
		}
		
		return word;
	}
	
}
