/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marvin Yosores
 */
public abstract class abstractmethode {
    
  // Abstract method (does not have a body)
  public abstract void makeNoice();
  
   // Regular method
  public void sleep() {
  System.out.println("Zzz");
  }
}
// Subclass (inherit from Animal)
class Pig extends abstractmethode {
  public void makeNoice() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}
class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.makeNoice();
    myPig.sleep();
  }
}