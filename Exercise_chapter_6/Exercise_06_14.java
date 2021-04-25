/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise_chapter_06;

import static java.lang.Math.pow;
import java.util.Scanner;
/**
 *
 * @author Erick Nick
 */
public class Exercise_06_14 {
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
        
        System.out.print("Enter a integer number: ");
        int number = input.nextInt();
        
        System.out.println("The value of pi with i = " + number + " is " + pi(number));
        
        /*System.out.println("i      m(i)");
            for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%-3d    %-5.4f\n", i, pi(i));
         }*/
        
        System.out.println("\ni           m(i)     ");
	System.out.println("---------------------");
	for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%-12d", i);
            System.out.printf("%-6.4f\n", pi(i));
	}
    }
    
    public static double pi(int i){
        double x = 0;
        double piValue = 4;
        
        for(int j = 1; j <= i; ++j){
            x += (pow(-1,j+1)/(2*j-1));
        }
         
        return piValue*x;
    }
}
