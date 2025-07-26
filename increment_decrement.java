package oop;

public class increment_decrement {
  public void performIncrement(int a) {
    System.out.println("Original value of a: " + a);
    int result1 = ++a;
    System.out.println("After increment (++a): " + result1);
  }

  public void performDecrement(int b) {
    System.out.println("Original value of b: " + b);
    int result2 = --b;
    System.out.println("After decrement (--b): " + result2);
  }
}
