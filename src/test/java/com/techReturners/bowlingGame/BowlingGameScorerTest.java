package com.techReturners.bowlingGame;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BowlingGameScorerTest {
	
	@Test
	public void testRollBall() {
		BowlingGameScorer bowlingGameScorer = new BowlingGameScorer();
		bowlingGameScorer.roll(0);
	}
	
	@Test
	public void testRollBallScoreZero() {
		BowlingGameScorer bowlingGameScorer = new BowlingGameScorer();
		bowlingGameScorer.roll(0);
		assertEquals(0, bowlingGameScorer.score());
	}
	
}
