/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marvin Yosores
 */
import java.util.Scanner;


public class Question4 {
    public void eat(){//method
    System.out.println("I can eat");
  }
}
class Doggo extends Question4 {//subclass
 String name;
  public void display() {//method
    System.out.println("My name is " + name);
  }
}
class Main {
    public Main(){//constructor
    // create an object of the subclass
    Doggo labrador = new Doggo();

    
    // access field of superclass
    labrador.name = "Marvin";
    labrador.display();

    // call method of superclass
    labrador.eat();
}
  public static void main(String[] args) {//main class   
      Scanner in = new Scanner (System.in );
      int password ;
      String Username ;   
      
      try{
        System.out.println("insert pass and username ");
        Username = in.nextLine();
        password = in.nextInt();
          
          if (Username.equals("Marvin") && password == 1234 ){
            Main hi = new Main();//object calling for constructor 
          }else{
              System.out.println("Something went wrong.");
          }
           
          
      }catch(Exception e){
          System.out.println("Something went wrong.");
      }
      
  }
} 
