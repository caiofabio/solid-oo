package fit.core;

public class CorrectiveMechanic extends Mechanic {
  
  @Override
  public void doMaintenance(Airplane airplane) {
    System.out.println("The airplane [" + airplane + "] is doing corrective maintenance ...");
  }
  
}
