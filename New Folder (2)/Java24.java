/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java24;

import java.util.Scanner;

/**
 *
 * @author Bhavana
 */
public class Java24 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
  long binaryNumber, decimalNumber = 0, j = 1, remainder;
  System.out.print("Input a binary number: ");
  binaryNumber = sc.nextLong();

  while (binaryNumber != 0) 
  {
   remainder = binaryNumber % 10;
   decimalNumber = decimalNumber + remainder * j;
   j = j * 2;
   binaryNumber = binaryNumber / 10;
  }
  System.out.println("Decimal Number: " + decimalNumber);
        // TODO code application logic here
    }
    
    
}
