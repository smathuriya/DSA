package phonepe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StopTrackingNULL implements StopTracking{
  @Override
  public Map<Integer, ArrayList<String>> stopTracking(Integer id,
      Map<Integer, ArrayList<String>> startTrack) {
    return new HashMap<>();
  }
}
