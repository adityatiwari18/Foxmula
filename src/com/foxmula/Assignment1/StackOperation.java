/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foxmula.Assignment1;


/**
 *
 * @author aditya
 */
class StackOperation {
    
    private int max;
    private int[] st;
    private int top;

    public StackOperation(int s) {
        this.max = s;
        this.st = new int[s];
        this.top = -1;
    }
    public void push(int n){
        if(top<max-1){
            st[++top]=n;
        }else{
            System.out.println("Invalid Operation Stack full");
        }
    }
    public void pop(){
        if(!isEmpty()){
            System.out.println("Invalid Operation Stack Empty");
        }else
            top--;
    }
    boolean isEmpty(){
        return top != -1;
    }
    public int getsize(){
        return top;
    }
}
