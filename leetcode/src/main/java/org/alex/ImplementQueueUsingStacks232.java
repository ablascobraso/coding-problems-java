package org.alex;

import java.util.Stack;


class ImplementQueueUsingStacks232 {

  public static void main(String[] args) {
    MyQueue myQueue = new MyQueue();
    myQueue.push(1); // queue is: [1]
    myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
    System.out.println(myQueue.peek()); // return 1
    System.out.println(myQueue.pop()); // return 1, queue is [2]
    System.out.println(myQueue.empty()); // return false
  }

  static class MyQueue {
    private final Stack<Integer> stack1 = new Stack<>();
    private final Stack<Integer> stack2 = new Stack<>();

    public void push(int x) {
      stack1.push(x);
    }

    public int pop() {
      Integer value = null;
      while(!stack1.isEmpty()){
        value = stack1.pop();
        stack2.push(value);
      }
      Integer lastValue = value;
      if(!stack2.isEmpty()) {
        stack2.pop();
      }
      while(!stack2.isEmpty()){
        value = stack2.pop();
        stack1.push(value);
      }
      return lastValue;
    }

    public int peek() {
      Integer value = null;
      while(!stack1.isEmpty()){
        value = stack1.pop();
        stack2.push(value);
      }
      Integer lastValue = value;
      while(!stack2.isEmpty()){
        value = stack2.pop();
        stack1.push(value);
      }
      return lastValue;
    }

    public boolean empty() {
      return stack1.isEmpty();
    }
  }
}