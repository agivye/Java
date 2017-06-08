/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author Joe_Pc
 */

//Question: Write a program that allows the user to enter a number and print if it's even or odd.
public class Even {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This is to check if your value is even or odd");
    System.out.println("Input your value :");

    Scanner input = new Scanner(System.in);
         int prim = input.nextInt();

    if ( prim % 2 == 0 )//Checks if the value you input is even.
        System.out.println("Your number is even");
     else
        System.out.println("Your number is odd");
  }
    }
