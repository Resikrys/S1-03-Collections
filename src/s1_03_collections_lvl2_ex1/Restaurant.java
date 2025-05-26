package s1_03_collections_lvl2_ex1;

public class Restaurant {
    private String name;
    private int score;

    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getScore(int score) {
        this.score = score;
    }

    public String toString() {
        return "Name: " + this.getName() + ", Score: " + this.getScore();
    }
}
