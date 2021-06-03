/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foxmula.Assignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author aditya
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //ArrayList element check
        ArrayList l = new ArrayList<>();
        l.add(1);
        l.add(54);
        l.add(21);
        System.out.println(new ArrayListCheck().check(l, 21)+"\n");
        
        //Set element check
        Set s = new HashSet<>();
        s.add(12);
        s.add(54);
        s.add(342);
        System.out.println(new SetCheck().check(s, 12)+"\n");
        
        //HashSet traversal
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(7);
        hs.add(4);
        hs.add(0);
        hs.add(3);
        HashSetTraversal hst = new HashSetTraversal();
        hst.traversal(hs);
        
        //treeset traversal
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(7);
        ts.add(4);
        ts.add(0);
        ts.add(3);
        TreeSetTraversal tst = new TreeSetTraversal();
        tst.traversal(ts);
        
        
        //Element Occurrences
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(23);
        arr.add(3);
        arr.add(2);
        arr.add(23);
        arr.add(2);
        arr.add(1);
        arr.add(33);
        ArrayListOccurrence alo = new ArrayListOccurrence();
        alo.frequency(arr);
        
        
        //Finding Pair
        ArrayList<Integer> ar2 = new ArrayList<>();
        System.out.println("\nEnter the value of k");
        int k = sc.nextInt();
        ar2.add(23);
        ar2.add(3);
        ar2.add(2);
        ar2.add(23);
        ar2.add(2);
        ar2.add(1);
        ar2.add(33);
        ar2.add(10);
        FindPair fp = new FindPair();
        fp.pair(k, ar2);
    }
}
