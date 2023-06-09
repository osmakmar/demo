package ch.zhaw.springboot.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ScoreKeeperTest {
    private ScoreKeeper scoreKeeper;

    @BeforeEach
    public void setUp() {
        scoreKeeper = new ScoreKeeper();
    }

    @Test
    public void testInitialScore() {
        assertEquals("000:000", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamA1() {
        scoreKeeper.scoreTeamA1();
        assertEquals("001:000", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamA2() {
        scoreKeeper.scoreTeamA2();
        assertEquals("002:000", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamA3() {
        scoreKeeper.scoreTeamA3();
        assertEquals("003:000", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamB1() {
        scoreKeeper.scoreTeamB1();
        assertEquals("000:001", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamB2() {
        scoreKeeper.scoreTeamB2();
        assertEquals("000:002", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamB3() {
        scoreKeeper.scoreTeamB3();
        assertEquals("000:003", scoreKeeper.getScore());
    }

    @Test
    public void testMultipleScoresTeamA() {
        scoreKeeper.scoreTeamA1();
        scoreKeeper.scoreTeamA2();
        scoreKeeper.scoreTeamA3();
        assertEquals("006:000", scoreKeeper.getScore());
    }

    @Test
    public void testMultipleScoresTeamB() {
        scoreKeeper.scoreTeamB1();
        scoreKeeper.scoreTeamB2();
        scoreKeeper.scoreTeamB3();
        assertEquals("000:006", scoreKeeper.getScore());
    }

    @Test
    public void testMultipleScoresBothTeams() {
        scoreKeeper.scoreTeamA3();
        scoreKeeper.scoreTeamA3();
        scoreKeeper.scoreTeamA2();
        scoreKeeper.scoreTeamB2();
        scoreKeeper.scoreTeamB2();
        assertEquals("008:004", scoreKeeper.getScore());
    }
}

