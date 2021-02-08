package fit.core;

public class GliderFactory implements AirplaneFactory {
  @Override
  public Airplane build() {
    return new Glider();
  }
}
