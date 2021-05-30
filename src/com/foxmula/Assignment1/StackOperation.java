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
    
    
    private class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    
    private Node top;
    private int elemCount;

    public StackOperation() {
        this.top = null;
        elemCount=-1;
    }
    public void push(int n){
        Node n1 = new Node(n);
        n1.next = top;
        top = n1;
        ++elemCount;
        
    }
    public void pop(){
        if(isEmpty())
            System.out.println("Can't remove stack empty");
        else{
            top=top.next;
            --elemCount;
        }
    }
    boolean isEmpty(){
        return top == null;
    }
    public int getsize(){
        return elemCount;
    }
}
