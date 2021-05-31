/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foxmula.Assignment2;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author aditya
 */
public class FindPair {
    public void pair(int k, ArrayList<Integer> ar){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<ar.size();i++){
            if(hm.containsKey(k-ar.get(i))){
                System.out.println("Pair = "+ar.get(i)+" , "+(k-ar.get(i)));
                break;
            }else
                hm.put(ar.get(i), 1);
                
        }
        
    }
}
