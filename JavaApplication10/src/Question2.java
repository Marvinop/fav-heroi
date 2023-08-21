/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mr Marvin Yosores
 */
public class Question2 {//superclass

  public void eat(){//method
    System.out.println("I can eat");
  }
}
class Doggo extends Question2 {//subclass
 String name;
  public void display() {//method
    System.out.println("My name is " + name);
  }
}
class Main {
  public static void main(String[] args) {//main class

    // create an object of the subclass
    Doggo labrador = new Doggo();

    // access field of superclass
    labrador.name = "Marvin";
    labrador.display();

    // call method of superclass
    labrador.eat();

  }
}  
