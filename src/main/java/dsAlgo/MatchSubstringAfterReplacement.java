package dsAlgo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MatchSubstringAfterReplacement {
  public static void main(String args[]){
    String s = "fooleetbar";
    String sub = "f00l";
    char[][] mappings = {{'o','0'}};
    System.out.println(matchReplacement(s, sub, mappings));
  }
  static public boolean matchReplacement(String s, String sub, char[][] mappings) {

      int n = sub.length();
      HashMap<Character, HashSet<Character>> map = new HashMap<>();
      for(char[] carr: mappings) {
        if (!map.containsKey(carr[0])){
          map.put(carr[0], new HashSet<Character>());
        }
        map.get(carr[0]).add(carr[1]);
      }
      for (int i=n-1;i<s.length();i++){
        int subIndex = 0;
        for (int j=i-(n-1);j<=i;j++){
          // !set.contains(sub.charAt(subIndex) +Character.toString(s.charAt(j)))
          char c1 = s.charAt(j);
          char c2 = sub.charAt(subIndex);
          if(c1 != c2){
            if(!map.containsKey(c2))
              break;
            if(map.containsKey(c2) && !map.get(c2).contains(c1))
              break;
          }
          subIndex++;
        }
        if(subIndex==sub.length())
          return true;
      }
      return false;

  }
}
