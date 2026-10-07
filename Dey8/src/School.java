public class School {

    private String name;
    private String subjects;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public School(String name, String subjects, int score) {
        this.name = name;
        this.subjects = subjects;
        this.score = score;
    }
}
