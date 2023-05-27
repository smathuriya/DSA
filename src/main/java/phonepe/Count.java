package phonepe;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface Count {

  Integer getCounts (List<String> tags, Map<Integer, ArrayList<String>> startTrack);

}
