package dsAlgo;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
  public static void main(String args[]){
    System.out.println(generateParenthesis(3));
  }

  public static List<String> generateParenthesis(int n) {
    List<String> list = new ArrayList<String>();
    fun(list,0,0,"",n);
    return list;
  }

  private static void fun(List<String> list, int i, int j, String s,int n) {
    if(i==n&&j==n){
      list.add(s);
    }
    if(i>j && i<n){
      fun(list,i+1,j,s+"(",n);
      fun(list,i,j+1,s+")",n);
    }
    if(i>j && i==n){
      fun(list, i,j+1,s+")",n);
    }
    if(i==j && i<n){
      fun(list,i+1,j,s+"(",n);
    }
  }
}
