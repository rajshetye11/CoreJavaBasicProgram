package com.bridgelabz.oopsprogram;

public class DeckOfCards {

	public void displayCards(String [] cards, String[] suits, String [] rank, int n) {
		for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                cards[suits.length*i + j] = rank[i] + " of " + suits[j];
                
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(cards[i]+" --> ");

        }
	}
	
	public void shuffleCards(String [] cards, String[] suits, String [] rank, int n) {
		System.out.println("");
		System.out.println("After Shuffle");
		System.out.println("");
		for (int i = 0; i < n ; i++) {
            int rd = i + (int) (Math.random() * (n-i));
            String temp = cards[rd];
            cards[rd] = cards[i];
            cards[i] = temp;
        }
		for (int i = 0; i < n; i++) {
            System.out.print(cards[i]+" --> ");
        }
	}
	
	public void cardsToPlayers(String [] cards) {
		System.out.println("");
		int k = 0;
		for (int i = 0; i < 4; i++) {
			System.out.print("Cards For Player " + (i+1) + ": \n");
			for (int j = 0; j < 9; j++) {

				System.out.print(cards[k] + "-->");
				k++;
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		String [] cards = new String[52];
		String [] suits = {"Hearts","Spades","Diamonds","Clubs"};
		String [] rank = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		int n =rank.length * suits.length;
		
		DeckOfCards d1 = new DeckOfCards();
		d1.displayCards(cards, suits, rank,n);
		System.out.println("");
		d1.shuffleCards(cards, suits, rank, n);
		System.out.println("");
		d1.cardsToPlayers(cards);
	}
	
}
