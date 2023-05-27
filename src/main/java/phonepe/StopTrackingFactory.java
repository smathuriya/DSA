package phonepe;

public class StopTrackingFactory {
  public StopTracking getStopTracking(String stoptracking){
    switch (stoptracking){
      case "stopTrackingByID":
        return new StopTrackingByID();
      default:
        return new StopTrackingNULL();
    }
  }
}
