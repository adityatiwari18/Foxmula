/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foxmula.Assignment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author aditya
 */
public class ArrayListOccurrence {
    public void frequency(ArrayList<Integer> ar){
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(Integer i:ar){
            if(hm.containsKey(i)) hm.put(i, hm.get(i)+1);
            else hm.put(i, 1);
        }
        
        for(Map.Entry m : hm.entrySet())
            System.out.println(m.getKey()+" : "+m.getValue());
    }
}
