package phonepe;

public class StartTrackingFactory {

  public StartTracking getStartTracking(String startTracking){
    switch (startTracking){
      case "startTrackingByID":
        return new StartTrackingbyID();
      default:
        return new StartTrackingNULL();
    }
  }
}
