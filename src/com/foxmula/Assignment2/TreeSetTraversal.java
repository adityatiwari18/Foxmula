/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foxmula.Assignment2;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author aditya
 */
public class TreeSetTraversal {
    public void traversal(TreeSet<Integer> ts){
        Iterator it = ts.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println("\n");
    }
}
