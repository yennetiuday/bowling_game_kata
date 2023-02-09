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
	public void testRollBallScoreIfSpareFollowedByFiveHappened() {
		bowlingGameScorer.roll(4);
		bowlingGameScorer.roll(6);
		bowlingGameScorer.roll(5);
		rollTheBall(0, 17);
		assertEquals(20, bowlingGameScorer.score());
	}
	
	@Test
	public void testRollBallScoreIfStrikeFollowedBySixAndThreeHappened() {
		bowlingGameScorer.roll(10);
		bowlingGameScorer.roll(6);
		bowlingGameScorer.roll(3);
		rollTheBall(0, 16);
		assertEquals(28, bowlingGameScorer.score());
	}
	
	@Test
	public void testAllStrikes() {
		rollTheBall(10, 12);
		assertEquals(300, bowlingGameScorer.score());
	}
	
	@Test
	public void testFirstRollNineAndSecondRollZero() {
		for(int i = 0; i< 10; i++) {
			bowlingGameScorer.roll(9);
			bowlingGameScorer.roll(0);
		}
		assertEquals(90, bowlingGameScorer.score());
	}
	
	@Test
	public void testAllSpareswithFirstRollFiveAndSecondRollFiveAndLastRollFive() {
		rollTheBall(5, 21);
		assertEquals(150, bowlingGameScorer.score());
	}
	
	private void rollTheBall(int pinsDown, int totalRolls) {
		for(int i=0; i< totalRolls; i++) {
			bowlingGameScorer.roll(pinsDown);		
		}
	}
	
}
