package fit.core;

public class PreventiveMechanic extends Mechanic {
  
  @Override
  public void doMaintenance(Airplane airplane) {
    System.out.println("The airplane [" + airplane + "] is doing preventive maintenance ...");
  }

}
