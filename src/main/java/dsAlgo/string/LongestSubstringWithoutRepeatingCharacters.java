package dsAlgo.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
  public static void main(String args[]){
    LongestSubstringWithoutRepeatingCharacters t = new LongestSubstringWithoutRepeatingCharacters();
    String str = "abba";
    System.out.println(t.lengthOfLongestSubstring(str));
  }
  public int lengthOfLongestSubstring(String s) {
    if (s.length()==0) return 0;
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    int max=0;
    for (int i=0, j=0; i<s.length(); ++i){
      if (map.containsKey(s.charAt(i))){
        //j = Math.max(j,map.get(s.charAt(i))+1);
        j = map.get(s.charAt(i))+1;
      }
      map.put(s.charAt(i),i);
      max = Math.max(max,i-j+1);
    }
    return max;
  }
}
