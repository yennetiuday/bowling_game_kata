package com.techReturners.bowlingGame;

public class BowlingGameScorer {
	
	private int score;
	
	public BowlingGameScorer() {
		score = 0;
	}

	public void roll(int pinsDown) {
		score += pinsDown;
	}

	public int score() {
		return score;
	}

	 
}
