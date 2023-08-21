/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marvin Yosores
 */
public class subclass {//SUPER Class
    public void honk(){
        System.out.print("You have picked ");
    }   
}

class Hero extends subclass{//Subclass
     private String hero = "miya";
  public static void main(String[] args) {
      
      Hero favHero = new Hero();
      
      favHero.honk();
      System.out.println(""+ favHero.hero);
      
      
  }
}
