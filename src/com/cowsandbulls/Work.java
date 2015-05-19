package com.cowsandbulls;

public class Work {

	public static void main(String[] args) {
		
		boolean winner = false;
		String original_word;
		String guess_word;
		int attempts=0;
		
		OriginalWord o = new OriginalWord();
		Dictionary d = new Dictionary();
		GuessWord g =  new GuessWord();
	
		o.readOriginalWord();
		original_word = o.checkOriginalWordLength();
		while(!d.searchDictionary(original_word)){
			System.out.println("Word not found in dictionary!");
			o.readOriginalWord();
			original_word = o.checkOriginalWordLength();
		}
		
		CowsAndBulls cb; 
		
		while(!winner){
		cb = new CowsAndBulls(original_word);
		g.readGuessWord();
		attempts++;
		guess_word = g.checkGuessWordLength();
		while(!d.searchDictionary(guess_word)){
			System.out.println("Word not found in dictionary!");
			g.readGuessWord();
			guess_word = g.checkGuessWordLength();
		}
		cb.setGuessWord(guess_word);
		System.out.println("Cows:"+cb.getCows());
		System.out.println("Bulls:"+cb.getBulls());
		winner = cb.isWinner();
		cb = null;
		if(attempts==5){
			break;
		}
		
		}
		
	if(winner && attempts<=5){
		System.out.println("Congrats! You guessed the correct word:"+original_word);
	}
	
	if(!winner && attempts>=5){
		System.out.println("Game Lost! You have exceeded the number of attempts");
		System.out.println("The original word is:"+original_word);
	}
	
	}
	

}
