package com.techReturners.bowlingGame;

import org.junit.jupiter.api.Test;

public class BowlingGameScorerTest {
	
	@Test
	public void testRollBall() {
		BowlingGameScorer bowlingGameScorer = new BowlingGameScorer();
		bowlingGameScorer.roll(0);
	}
	
}
