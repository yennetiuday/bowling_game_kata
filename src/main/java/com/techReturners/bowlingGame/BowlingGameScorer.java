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
			if (isStrike(currentRoll)) {
				score += getStrikeScore(currentRoll);
				currentRoll++;
			}
			else if (isSpare(currentRoll)) {
				score += getSpareScore(currentRoll);
				currentRoll += 2;
			} else {
				score += getStandardScore(currentRoll);
				currentRoll += 2;
			}
		}
		return score;
	}

	private boolean isStrike(int currentRoll) {
		return rolls[currentRoll] == 10;
	}

	private int getStrikeScore(int currentRoll) {
		return 10 + rolls[currentRoll+1] + rolls[currentRoll+2];
	}

	private boolean isSpare(int currentRoll) {
		return getStandardScore(currentRoll) == 10;
	}

	private int getSpareScore(int currentRoll) {
		return 10 + rolls[currentRoll+2];
	}

	private int getStandardScore(int currentRoll) {
		return rolls[currentRoll] + rolls[currentRoll+1];
	}
	 
}
