package phonepe;

import java.util.ArrayList;
import java.util.Map;

public interface StopTracking {
  Map<Integer, ArrayList<String>> stopTracking (Integer id, Map<Integer, ArrayList<String>> startTrack);
}
