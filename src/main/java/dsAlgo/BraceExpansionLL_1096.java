package dsAlgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class BraceExpansionLL_1096 {
  static Set<String> set = new HashSet<String>();
  static StringBuilder sb = new StringBuilder();
  static List<String> res = new ArrayList<String>();
  static Stack<String> stack = new Stack<String>();
  public static void main(String args[]){
    String a = "{{a,b},{c,d}}";
    int MOD = (int) 1e3+3;
    System.out.println(MOD);
    String str = "Advertiser Currency,Creative,Creative ID,Date,Zip Code,Impressions";

    String[] colums = str.split(","); // These are the headers in the CSV.

    //System.out.println(braceExpansionII(a));
  }
  public static List<String> braceExpansionII(String expression) {
    stack.push(expression);
    iter_dfs();
    Collections.sort(res);
    return res;
  }
  private static void iter_dfs(){
    while(!stack.isEmpty()) {
      String str = stack.pop();
      if (str.indexOf('{') == -1) {
        if (!set.contains(str)) {
          res.add(str);
          set.add(str);
        }
        continue;
      }

      int i = 0, l = 0, r = 0;
      while (str.charAt(i) != '}') {
        if (str.charAt(i++) == '{')
          l = i - 1;
      }
      r = i;

      String before = str.substring(0, l);
      String after = str.substring(r + 1, str.length());
      String[] args = str.substring(l + 1, r).split(",");

      for (String s : args) {
        sb.setLength(0);
        stack.push(sb.append(before).append(s).append(after).toString());
      }
    }
  }
}
