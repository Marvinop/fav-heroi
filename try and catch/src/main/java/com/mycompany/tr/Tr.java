/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tr;
import java.util.Scanner;
/**
 *
 * @author Marvin Yosores
 */
public class Tr {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String[]hero={"what?? please select the righ","akai","bruno"};
        int[]price={0,10,20};
         try{
        System.out.println("please enter your hero \n 1. akai \n 2. bruno");
        int choices = in.nextInt();
        System.out.println("hero : " + hero[choices] + " Price: RM" + price[choices]);}
         catch(Exception io){
             System.out.println("please enter the right hero");
         }
        
    }
}
