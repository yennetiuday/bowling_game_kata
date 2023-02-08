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
		for(int currentFrame = 0; currentFrame<10; currentFrame++) {
			if (isSpare(currentRoll)) {
				score += getSpareScore(currentRoll);
			} else {
				score += getStandardScore(currentRoll);
			}
			currentRoll += 2;
		}
		return score;
	}

	private int getSpareScore(int currentRoll) {
		return rolls[currentRoll] + rolls[currentRoll+1] + rolls[currentRoll+2];
	}

	private int getStandardScore(int currentRoll) {
		return rolls[currentRoll] + rolls[currentRoll+1];
	}

	private boolean isSpare(int currentRoll) {
		return getStandardScore(currentRoll) == 10;
	}

	 
}
