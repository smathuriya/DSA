package phonepe;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StartTrackingbyID implements StartTracking{

  @Override
  public Map<Integer, ArrayList<String>> startTracking(Integer id, List<String> tags, Map<Integer, ArrayList<String>> startTrack) {
    if(startTrack.get(id) == null){
      ArrayList<String> idTags = new ArrayList<>(tags);
      startTrack.put(id, idTags);
    }
    return startTrack;
  }
}
