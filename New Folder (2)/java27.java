/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;

import java.util.Scanner;

/**
 *
 * @author Bhavana
 */
public class JavaApplication28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
  int[] octal_numvalues = {0, 1, 10, 11, 100, 101, 110, 111};
  long octal_num, tempoctal_num, binary_num, place;
  int rem;
  System.out.print("Input any octal number: ");
  octal_num = sc.nextLong();
  tempoctal_num = octal_num;
  binary_num = 0;
  place = 1;
  while (tempoctal_num != 0)
  {
   rem = (int)(tempoctal_num % 10);
   binary_num = octal_numvalues[rem] * place + binary_num;
   tempoctal_num /= 10;
   place *= 1000;
  }
  System.out.print("Equivalent binary number: " + binary_num+"\n");
 }
    }
    
}
