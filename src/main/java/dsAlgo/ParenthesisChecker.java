package dsAlgo;

import java.util.Stack;

public class ParenthesisChecker {
  public static void main (String[] args)
  {
    String str = "[()]{}{[()()]()}";
    System.out.println(ispar(str));
  }

  private static boolean ispar(String x) {
    Stack<Character> stack = new Stack<>();
    char[] charactorString = x.toCharArray();
    for (char c : charactorString){
      if(c == '[' || c == '(' || c == '{'){
        stack.push(c);
      }else {
        if(stack.empty())
          return false;
        switch (c){
          case ']':
            if('[' != stack.pop())
              return false;
            break;
          case ')':
            if('(' != stack.pop())
              return false;
            break;
          case '}':
            if('{' != stack.pop())
              return false;
            break;
        }
      }
    }
    if(stack.empty())
      return true;
    else
      return false;
  }
}
