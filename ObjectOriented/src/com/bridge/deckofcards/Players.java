package com.bridge.deckofcards;

public class Players {
	String[] playerCards = new String[9];
	
	public Players() {
		
	}
	
	public Players(String[] playerCards) {
		this.playerCards = playerCards;
	}

	public String[] getPlayerCards() {
		return playerCards;
	}

	public void setPlayerCards(String[] playerCards) {
		this.playerCards = playerCards;
	}
	
	
}
