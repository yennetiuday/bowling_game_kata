package com.techReturners.bowlingGame;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BowlingGameScorerTest {
	BowlingGameScorer bowlingGameScorer;
	
	@BeforeEach
	public void setUp() {
		bowlingGameScorer = new BowlingGameScorer();
	}
	
	@Test
	public void testRollBall() {
		bowlingGameScorer.roll(0);
	}
	
	@Test
	public void testRollBallScoreZero() {
		bowlingGameScorer.roll(0);
		assertEquals(0, bowlingGameScorer.score());
	}
	
	@Test
	public void testRollBallScoreZeroForAllFrames() {
		for(int i=0; i< 20; i++) {
			bowlingGameScorer.roll(0);		
		}
		assertEquals(0, bowlingGameScorer.score());
	}
	
	@Test
	public void testRollBallScoreOnesForAllFrames() {
		for(int i=0; i< 20; i++) {
			bowlingGameScorer.roll(1);		
		}
		assertEquals(20, bowlingGameScorer.score());
	}
	
}
