public class Car {

  private  String model;
  private String color;
  private int maxSpeed;

    public Car(String madel) {
        this.model = madel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String madel) {
        this.model = madel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int mexSpeed) {
        this.maxSpeed = mexSpeed;
    }

    public Car(String madel, String color, int mexSpeed) {
        this.model = madel;
        this.color = color;
        this.maxSpeed = mexSpeed;
    }

    public Car(String madel, String color) {
        this();
        this.model = madel;
        this.color = color;
    }

    public Car() {
        this("소나타","흰색",180);






    }




    }

