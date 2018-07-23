/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java22;

import java.util.Scanner;

/**
 *
 * @author Bhavana
 */
public class Java22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int dec_num, rem, quot, i=1, j;
        int oct_num[] = new int[100];
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Input a Decimal Number: ");
        dec_num = scan.nextInt();
		
        quot = dec_num;
		
        while(quot != 0)
        {
            oct_num[i++] = quot%8;
            quot = quot/8;
        }
		
        System.out.print("Octal number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(oct_num[j]);
        }
		System.out.print("\n");
        // TODO code application logic here
    }
    
}
