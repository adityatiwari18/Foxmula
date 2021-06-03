/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foxmula.Assignment3;

import java.util.Scanner;

/**
 *
 * @author aditya
 */
class PrimeOddException extends Exception{
    public PrimeOddException(String message){
        super(message);
    }
}

public class CustomException {
    
    static boolean isPrime(int n){
        int c=0;
        if(n<=1){  
           return false;  
        }  
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                ++c;
        }
        return c == 0;
    }

    static boolean isOdd(int n){
        return (n%2!=0);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        try{
            if(isPrime(num)&&isOdd(num))
                throw new PrimeOddException("Number is invalid");
            System.out.println("Number is valid");
        }catch(PrimeOddException poe){
            System.out.println(poe.getMessage());
        }
    }
}
