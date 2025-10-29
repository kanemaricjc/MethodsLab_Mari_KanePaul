/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.methodslab;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class MethodsLab {

    
    
    public static void greetuser() {
        System.out.println("Hello and welcome to KP's project!"); //task number 1
    }
    
     static int plus(int a, int b) {
        return a+b;                     //from here
    }
    
    static int minus(int a, int b) {
        return a-b;
    }
    
    static int times(int a, int b) {
        return a*b;
    }
    
    static double divide(double a, double b) {
        return a/b;                             //to here is task number 2
    }
    
    public static long factorial(int n){
        
        if (n<0) {
            System.out.println("Please input a non-negative number.");
            return 1;
        }
        if (n==0) {
            return 1;                                           //this is all task number 3
        }
        long factorialanswer = 1;
        for ( int i = 1; i <= n; i++ ){
            factorialanswer*=i;
        }
       return factorialanswer;
       
    }
    
    public static int sumArray (int[] arr) {
        
        int sum = 0;
            for (int num : arr ){        //task number 4
                sum+=num;
            }
            return sum;
    }
    
    public static boolean primechecker (int a) {
        
        if ( a <= 1 ) {
            return false; //below 1 kay false nana sya since the only numbers are 1, 0 and negative numbers. and prime numbers only work for natural numbers.
        }
        
        if ( a == 2 ) {
            return true; //nag buhat kog lahi para sa 2 since it is the only number nga even pero is also a prime.
        }
        
        if ( a % 2 == 0 ) {
            return false; //all even numbers are not prime
        }
        
        for ( int z = 3; z * z <= a; z += 2 ) {
            
            if ( a % z == 0 ) {
                return false;
            }
        
        }
        
        return true;
    }
    
    

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);             
        
        greetuser();
        
        System.out.println();
        System.out.println("Basic Arithmetic Calculator.");
        System.out.println();
        System.out.print("Please enter the first number: ");
        int afirst = input.nextInt();
        System.out.print("Please enter the second number: ");
        int bfirst = input.nextInt();
        double afirstdouble = afirst;
        double bfirstdouble = bfirst;
        System.out.println();

            System.out.println("Addition: " + plus( afirst, bfirst ));
            System.out.println("Subtraction: " + minus( afirst, bfirst ));
            System.out.println("Multiplication: " + times( afirst, bfirst ));
            System.out.println("Division: " + divide( afirstdouble, bfirstdouble ));
            System.out.println();
        
            
        System.out.print("Please enter the number you wish to find the factorial of: ");
        int factori = input.nextInt();
        
            System.out.println("The factorial of " + factori + " is: " + factorial(factori) );
            System.out.println();
            
        System.out.print("Please input the size of the array (number of integers): ");
            int arraysize = input.nextInt();
            System.out.println();
         
            int[] arraynumbers = new int [arraysize];
            
            for ( int i = 0; i < arraysize; i++) {
                
                System.out.print("Enter number: ");
                arraynumbers[i] = input.nextInt();
                
            }
            
            System.out.println();
            
            int arrayadded = sumArray(arraynumbers);
            
            System.out.println( "The sum of all the " + arraysize + " numbers of the array is: " + arrayadded );
            System.out.println();
         
         
            
            
        System.out.print( "Enter a number to check if it is prime or not: " );
        int prime = input.nextInt();
        
            System.out.println( prime + " being a prime number is: " + primechecker ( prime ) + "." );
        
            
        input.close();
    }
}
