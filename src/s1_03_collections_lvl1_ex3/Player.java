package s1_03_collections_lvl1_ex3;

public class Player {
    private String name;
    private int totalScore;

    public Player(String name, int totalScore) {
        this.name = name;
        this.totalScore = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getTotalScore() {
        return this.totalScore;
    }

    public void addPoint() {
        totalScore++;
    }
}
