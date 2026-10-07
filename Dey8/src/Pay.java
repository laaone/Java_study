public class Pay {

  private String cleanup;
  private String employeeName;
  private String rank;
  private int salary;
  private int annalLeave;

    public String getCleanup() {
        return cleanup;
    }

    public void setCleanup(String cleanup) {
        this.cleanup = cleanup;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnalLeave() {
        return annalLeave;
    }

    public void setAnnalLeave(int annalLeave) {
        this.annalLeave = annalLeave;
    }

    public Pay(String employeeName, String cleanup, String rank, int salary, int annalLeave) {
        this.employeeName = employeeName;
        this.cleanup = cleanup;
        this.rank = rank;
        this.salary = salary;
        this.annalLeave = annalLeave;

    }
}
