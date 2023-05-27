package phonepe;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface StartTracking {

  public Map<Integer, ArrayList<String>> startTracking (Integer id, List<String> hierarchicalTags, Map<Integer, ArrayList<String>> startTrack);
}
