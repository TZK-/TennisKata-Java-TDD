package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TennisGameTest {

	private TennisGame tennis;

	private void setTheGameInConditionsForTheTest(int serverScore, int receiverScore) {
		this.tennis = new TennisGame();
		for(int servSc = 0; servSc < serverScore; servSc++){
			this.tennis.serverScored();
		}
		
		for(int receiSc = 0; receiSc < receiverScore; receiSc++){
			this.tennis.receiverScored();
		}
	}

	private void checkAssertions(String score) {
		assertEquals(this.tennis.getScore(), score);
	}

	@Test
	public void runAllTests() {
		// TODO
		List<Score> scores = new ArrayList<>();
		for (Score score : scores) {
			this.setTheGameInConditionsForTheTest(score.getServerScore, score.getReceiverScore());
			this.checkAssertions(score.toString());
		}
	}

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

	@Test
	public void ifTheServerAndTheReceiverMakePoints() {
		TennisGame tennisGame = new TennisGame();

	}

}
