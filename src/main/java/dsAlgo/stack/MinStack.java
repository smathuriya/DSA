package dsAlgo.stack;

import java.util.Stack;

public class MinStack {
  class StackItem{
    int item;
    int minEle;
    StackItem(int item, int minEle){
      this.item = item;
      this.minEle = minEle;
    }
  }
  Stack<StackItem> stack;
  public static void main(String args[]){
    MinStack t = new MinStack();
    t.push(-2);
    t.push(0);
    t.push(-3);
    System.out.println(t.getMin()); // return -3
    t.pop();
    System.out.println(t.top());
    t.pop();
    System.out.println(t.getMin());
  }
  public MinStack() {
    stack = new Stack<StackItem>();
  }

  public void push(int val) {
    if(stack.empty()){
      stack.push(new StackItem(val,val));
      return;
    }
    if(stack.peek().minEle < val){
      stack.push(new StackItem(val, stack.peek().minEle));
    }else {
      stack.push(new StackItem(val, val));
    }
  }

  public void pop() {
    stack.pop();
  }

  public int top() {
    return stack.peek().item;
  }

  public int getMin() {
    return stack.peek().minEle;
  }
}
