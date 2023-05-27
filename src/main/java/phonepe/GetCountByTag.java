package phonepe;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GetCountByTag implements  Count{

  @Override
  public Integer getCounts(List<String> tags, Map<Integer, ArrayList<String>> startTrack) {
    int count =0;
    for(Map.Entry<Integer, ArrayList<String>> tag: startTrack.entrySet()){
      ArrayList<String> tagList = tag.getValue();
      if(matchTags(tagList, (ArrayList<String>) tags)){
        count++;
      }
    }
    return count;
  }

  public static Boolean matchTags(List<String> tagList,ArrayList<String> checkTags){
    int i=0;
    while(tagList.size() > i && checkTags.size()>i){
      if(!tagList.get(i).equals(checkTags.get(i))){
        return false;
      }
      i++;
    }

    return true;
  }
}
