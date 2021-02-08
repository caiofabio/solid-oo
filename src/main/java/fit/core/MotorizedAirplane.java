package fit.core;

public class MotorizedAirplane extends Airplane implements Motorized {
  public void start() {
    System.out.println("The airplane [" + this + "] is starting ...");
  }

  public void stop() {
    System.out.println("The airplane [" + this + "] is stopping ...");
  }
}
