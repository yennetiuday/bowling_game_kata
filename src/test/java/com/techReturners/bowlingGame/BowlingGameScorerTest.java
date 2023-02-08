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
		rollTheBall(0, 20);
		assertEquals(0, bowlingGameScorer.score());
	}

	@Test
	public void testRollBallScoreOnesForAllFrames() {
		rollTheBall(1, 20);
		assertEquals(20, bowlingGameScorer.score());
	}
	
	@Test
	public void testRollBallScoreIfSpareHappened() {
		bowlingGameScorer.roll(4);
		bowlingGameScorer.roll(6);
		bowlingGameScorer.roll(3);
		rollTheBall(0, 17);
		assertEquals(16, bowlingGameScorer.score());
	}
	
	private void rollTheBall(int pinsDown, int totalRolls) {
		for(int i=0; i< totalRolls; i++) {
			bowlingGameScorer.roll(pinsDown);		
		}
	}
	
}
