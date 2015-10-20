package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class TennisGameTest {
	@Test
	public void atTheBeginningOfTheGameTheScoreShouldBeLoveAll() {
		TennisGame tennisGame = new TennisGame();
		assertEquals(tennisGame.getScore(), "love-all");
	}

	@Test
	public void ifTheServerMakesTheFirstPoint() {
		TennisGame tennisGame = new TennisGame();
		tennisGame.serverScored();
		assertEquals(tennisGame.getScore(), "fifteen-love");
	}
	
	@Test
	public void ifTheReceiverMakesTheFirstPoint() {
		TennisGame tennisGame = new TennisGame();
		tennisGame.receiverScored();
		assertEquals(tennisGame.getScore(), "love-fifteen");
	}
	
}
