package dsAlgo.twoPointers;

import java.util.HashSet;
import java.util.Set;

public class ReverseWordsinaString {
  public static void main(String args[]){
    String s = "a good   example";
    System.out.println(reverseWords(s));

  }
  public static String reverseWords(String s) {
    StringBuilder str = new StringBuilder();
    String[] l = s.split(" ");
    for (int i=l.length-1;i>=0;i--){
      if(!l[i].equals(""))
        str.append(l[i]+" ");
    }
    return str.toString().trim();
  }
}
