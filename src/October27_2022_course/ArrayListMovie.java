package October27_2022_course;

public class ArrayListMovie {
    private String name;
    private Double score;
    private String actor;

    public ArrayListMovie(String name, Double score, String actor) {

        this.name = name;
        this.score = score;
        this.actor = actor;
    }

    public ArrayListMovie() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}