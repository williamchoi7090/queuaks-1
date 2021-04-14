import java.util.*;
  
class Main{ 
  static class Queue{ 
    static Stack<Integer>a= new Stack<Integer>(); 
    static Stack<Integer>b= new Stack<Integer>(); 
    static void enQueue(int x){ 
      while (!a.isEmpty()){ 
        b.push(a.pop()); 
      } 
      a.push(x); 
      while (!b.isEmpty()){ 
        a.push(b.pop()); 
      } 
    } 
    static int deQueue(){ 
      if (a.isEmpty()){ 
        System.out.println("Q is Empty"); 
        System.exit(0);
      } 
      int x= a.peek(); 
      a.pop(); 
      return x; 
    } 
  }
  public static void main(String[] args){ 
    Queue c= new Queue(); 
    c.enQueue(1); 
    c.enQueue(2); 
    c.enQueue(3);
    c.enQueue(4); 
    c.enQueue(5); 
    System.out.println(c.deQueue()); 
    System.out.println(c.deQueue());
    System.out.println(c.deQueue());
    System.out.println(c.deQueue());
    System.out.println(c.deQueue());
  } 
} 