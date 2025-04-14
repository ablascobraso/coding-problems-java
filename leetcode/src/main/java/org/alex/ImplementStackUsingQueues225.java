package org.alex;

import java.util.ArrayDeque;
import java.util.Queue;


public class ImplementStackUsingQueues225
{
  public static void main(String[] args)
  {
    MyStack obj = new MyStack();
    obj.push(1);
    obj.push(2);
    int top = obj.top();
    int pop = obj.pop();
    int pop2 = obj.pop();
    boolean isEmpty = obj.empty();

    System.out.println("Top: " + top);
    System.out.println("Pop: " + pop);
    System.out.println("Pop2: " + pop2);
    System.out.println("Is Empty: " + isEmpty);
  }
}

class MyStack {

  Queue <Integer> queue1;
  Queue <Integer> queue2;

  public MyStack() {
    queue1 = new ArrayDeque<>();
    queue2 = new ArrayDeque<>();
  }

  public void push(int x) {
    queue1.add(x);
  }

  public int pop() {
    if(queue1.isEmpty()) {
      queue1.addAll(queue2);
      queue2.clear();
    }
    while (queue1.size() > 1) {
      queue2.add(queue1.poll());
    }
    return queue1.poll();
  }

  public int top() {
    if(queue1.isEmpty()) {
      queue1.addAll(queue2);
      queue2.clear();
    }
    while (queue1.size() > 1) {
      queue2.add(queue1.poll());
    }
    int topElement = queue1.poll();
    queue2.add(topElement);
    return topElement;
  }

  public boolean empty() {
    if(queue1.isEmpty()) {
      queue1.addAll(queue2);
      queue2.clear();
    }
    return queue1.isEmpty();
  }
}