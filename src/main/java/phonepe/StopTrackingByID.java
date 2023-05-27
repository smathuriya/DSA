package phonepe;

import java.util.ArrayList;
import java.util.Map;

public class StopTrackingByID implements StopTracking{
  @Override
  public Map<Integer, ArrayList<String>> stopTracking(Integer id, Map<Integer, ArrayList<String>> startTrack) {
    if(startTrack.get(id) == null){
      System.out.println("id doesn't exist'");
    }else{
      startTrack.remove(id);
    }

    return startTrack;
  }
}
