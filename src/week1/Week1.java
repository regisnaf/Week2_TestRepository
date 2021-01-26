/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
package week1;

/**
 *
 * @author Regis Andrade
 * Jan 19, 2021
 * Program to inputa word and display it in reverse
 */
public class reverseWord {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a word");
       String temp = input.nextLine();
       
       char [] word = new char [temp.length()];
       for (int i = 0; i<temp.length(); i++) {
          word[i] = temp.charAt(i);
       }
       
       System.out.println("The entered string is : ");
       for (char k: word) {
       System.out.println(k);
       }
       
       System.out.println("\nThe reverse string is: ");
       for (int j = word.length - 1; j>= 0; j--) {
       System.out.println(word[j]);
       }
    }
    
}