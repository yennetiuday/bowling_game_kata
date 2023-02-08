package com.techReturners.bowlingGame;

public class BowlingGameScorer {
	
	private int roll;
	private int[] rolls;
	
	public BowlingGameScorer() {
		rolls = new int[21];
	}

	public void roll(int pinsDown) {
		rolls[roll++] = pinsDown;
	}

	public int score() {
		int score = 0;
		int currentRoll = 0;
		for(int CurrentFrame = 0; CurrentFrame<10; CurrentFrame++) {
			score += rolls[currentRoll] + rolls[currentRoll+1];
			currentRoll += 2;
		}
		return score;
	}

	 
}
