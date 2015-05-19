package com.cowsandbulls;

public class CowsAndBulls {
	
	String originalWord;
	String guessWord;
	int cows =0;
	int bulls =0;
	boolean result = false;
	
	CowsAndBulls(String originalWord){
		
		this.originalWord = originalWord;
	}
	
	public void setGuessWord(String guessWord){
		this.guessWord = guessWord;
	}
	
	public int getCows(){
		
		for(int i=0; i< 4;i++ ){
			for(int j=0; j<4; j++){
				if(originalWord.charAt(i) == guessWord.charAt(j)){
					cows++;
				}
			}
		}
		return cows;
	}
	
	public int getBulls(){
		
		for(int i=0; i<4; i++){
			if(originalWord.charAt(i) == guessWord.charAt(i)){
				bulls++;
			}
		}
		return bulls;
	}

	public boolean isWinner(){
		if(cows==4 && bulls ==4){
			result = true;
		}
		return result;
	}
}
