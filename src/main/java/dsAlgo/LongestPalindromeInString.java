package dsAlgo;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromeInString {
  public static void main(String args[]){
    String str = "babad";
    System.out.println(longestPalin(str));
  }
  static String longestPalin(String s){
    if(s.length()==1){
      return s;
    }
    String finalStr = "";
    for (int i=1;i<s.length();i++){
      String str1 = fun(s,i,i);
      if (str1.length()>finalStr.length())
        finalStr = str1;
      String str2 = fun(s,i-1,i);
      if (str2.length()>finalStr.length())
        finalStr = str2;
    }
    return finalStr;
  }
  private static String fun(String s, int l, int r) {
    while (l>=0 && r<=s.length()-1){
      if(s.charAt(l)==s.charAt(r)){
        l--;r++;
      }else
        break;
    }
    return s.substring(++l,--r+1);
  }
}
