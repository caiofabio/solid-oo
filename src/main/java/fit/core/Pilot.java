package fit.core;

public class Pilot {
  public void taxi(Airplane airplane) {
    System.out.println("Taxiing the airplane [" + airplane + "] ...");
  public void fly(Airplane airplane) {
    System.out.println("Flying one motorized airplane [" + airplane + "]");
  }

  public void fly(Glider glider) {
    System.out.println("Flying one glider [" + glider + "]");
  }
}
