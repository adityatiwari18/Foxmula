/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foxmula.Assignment1;

import java.util.Scanner;

/**
 *
 * @author aditya
 */

public class Main {

    public static void main(String[] args) {
        
        // Square
        Square s = new Square(1,1,2,2,1,2,1,2);
        s.area();
        
        //Rectangle
        Rectangle r = new Rectangle(-6,6,6,-6,2,2,0,0);
        r.area();
        
        //Trapezoid
        Trapezoid t = new Trapezoid(-2,2,6,-6,2,2,0,0,2);
        t.area();
        
        //Paralleogram
        Parallelogram p = new Parallelogram(18,48,36,6,26,26,7,7,19);
        p.area();
        
        
        //Adding 2 times
        Time t1=new Time(2, 45, 55);
        Time t2=new Time(6, 15, 5);
        t1.add(t2);
        
        
        //Stacks
        Scanner sc = new Scanner(System.in);
        
        StackOperation st1 = new StackOperation();
        StackOperation st2 = new StackOperation();
        boolean flag=true;
        while(flag){
            System.out.println("Enter Your choice");
            System.out.println("1- Enter element in 1st Stack");
            System.out.println("2- Enter element in 2nd Stack");
            System.out.println("3- Delete element in 1st Stack");
            System.out.println("4- Delete element in 2nd Stack");
            System.out.println("5- Exit");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter any number");
                    int n = sc.nextInt();
                    st1.push(n);
                    if(st1.getsize()==st2.getsize()&&st1.getsize()>-1)
                        System.out.println("Size of both stacks = "+(st1.getsize()+1));
                    break;
                case 2:
                    System.out.println("Enter any number");
                    int n1 = sc.nextInt();
                    st2.push(n1);
                    if(st1.getsize()==st2.getsize()&&st1.getsize()>-1)
                        System.out.println("Size of both stacks = "+(st1.getsize()+1));
                    break;
                case 3:
                    st1.pop();
                    if(st1.getsize()==st2.getsize()&&st1.getsize()>-1)
                        System.out.println("Size of both stacks = "+(st1.getsize()+1));
                    break;
                case 4:
                    st2.pop();
                    if(st1.getsize()==st2.getsize()&&st1.getsize()>-1)
                        System.out.println("Size of both stacks = "+(st1.getsize()+1));
                    break;
                case 5:
                    flag=false;
                    break;
            }
        }
    }
    
}
