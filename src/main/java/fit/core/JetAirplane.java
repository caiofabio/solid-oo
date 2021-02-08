package fit.core;

public class JetAirplane extends MotorizedAirplane implements Jet {

  @Override
  public void reverse() {
    System.out.println("The airplane [" + this + "] is with reverse mode ...");
  }
  
}
