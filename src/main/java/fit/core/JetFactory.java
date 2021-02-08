package fit.core;

public class JetFactory implements AirplaneFactory {
  @Override
  public Airplane build() {
    return new JetAirplane();
  }
}
