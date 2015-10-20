package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void ifThereIsALoveAllSituation()
	{
		TennisGame tennisGame = new TennisGame();
		assertEquals(tennisGame.getScore(), "love-all");
	}

}
