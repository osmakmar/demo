package ch.zhaw.springboot.demo;
public class ScoreKeeper {
    private int scoreTeamA;
    private int scoreTeamB;
    
    public ScoreKeeper() {
        scoreTeamA = 0;
        scoreTeamB = 0;
    }

    public String getScore() {
        return String.format("%03d:%03d", scoreTeamA, scoreTeamB);
    }

    public void scoreTeamA1() {
        scoreTeamA += 1;
    }

    public void scoreTeamA2() {
        scoreTeamA += 2;
    }

    public void scoreTeamA3() {
        scoreTeamA += 3;
    }

}
