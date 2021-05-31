/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foxmula.Assignment2;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author aditya
 */
public class HashSetTraversal {
    public void traversal(HashSet<Integer> hs){
        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println("\n");
    }
}
