package fit.core;

public class MotorizedAirplaneFactory implements AirplaneFactory {

  @Override
  public Airplane build() {
    return new MotorizedAirplane();
  }
  
}
