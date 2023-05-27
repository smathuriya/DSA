package phonepe;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CountNULL implements Count{
  @Override
  public Integer getCounts(List<String> tags, Map<Integer, ArrayList<String>> startTrack) {
    return Integer.MIN_VALUE;
  }
}
