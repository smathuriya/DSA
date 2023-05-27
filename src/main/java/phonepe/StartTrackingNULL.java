package phonepe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StartTrackingNULL implements StartTracking{
  @Override
  public Map<Integer, ArrayList<String>> startTracking(Integer id, List<String> hierarchicalTags,
      Map<Integer, ArrayList<String>> startTrack) {
    return new HashMap<>();
  }
}
