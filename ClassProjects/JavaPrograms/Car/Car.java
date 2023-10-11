public class Car
{
  private String color;
  private String make;
  private int hp;
  private double mpg;

  public Car(String color, String make, int hp, double mpg)
  {
    color = color;
    make = make;
    hp = hp;
    mpg = mpg;

  }
  public Car(String color, String make)
  {
    color = color;
    make = make;
    hp = 0;
    mpg = 0;
  }
  public Car()
  {

  }

  public String getMake()
  {
    return make;
  }
}
