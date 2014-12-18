package com.practice;

import java.util.ArrayList;

public class CardGame {
	public static void main(String[] args) {
		String cardSeq = "1A2E5A6D4F9E3C5B";
		beginGame(cardSeq);
	}
	
	public static void beginGame(String cardSeq) {
		ArrayList<Card> cards = new ArrayList<Card>();
		for (int i = 0; i < cardSeq.length(); i += 2) {
			int digit = cardSeq.charAt(i) - '0';
			char letter = cardSeq.charAt(i + 1);
			cards.add(new Card(digit, letter));
		}
		if (cards.size() < 4) {
			System.out.println("You need more cards to play the game, sorry.");
		}
		boolean lose = false;
		while (cards.size() >= 4 && !lose) {
			int start = 0;
			int end = 3;
			if (cards.get(start).digit == cards.get(end).digit) {
				
			} else if (cards.get(start).letter == cards.get(end).letter) {
				
			} else {
				while (cards.get(start) != cards.get(end)) {
					start++;
					end++;
					if (end == cards.size()) {
						lose = true;
						break;
					}
				}
			}
			
		}
		if (cards.size() == 0) {
			System.out.println("You win");
		} else {
			System.out.println("You lose");
		}
	}
}

class Card{
	int digit;
	char letter;
	
	public Card(int digit, char letter) {
		this.digit = digit;
		this.letter = letter;
	}
}
