package dsAlgo.array;

import java.util.Stack;

public class ValidParentheses {
  public static void main(String args[]){
    ValidParentheses t = new ValidParentheses();
    System.out.println(t.isValid("("));
  }
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (char ch : s.toCharArray()){
      if(ch=='(' || ch=='{' || ch=='['){
        stack.push(ch);
      }else{
        if(stack.empty())
          return false;
        char pop = stack.pop();
        switch (ch){
          case ')':
            if(pop != '(')
              return false;
            break;
          case '}':
            if(pop != '{')
              return false;
            break;
          case ']':
            if(pop != '[')
              return false;
            break;
        }
      }
    }
    return stack.empty();
  }
}
