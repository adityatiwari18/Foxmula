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
public class Time {
    private int hh, mm, sec;

    public Time(int hh, int mm, int sec) {
        this.hh = hh;
        this.mm = mm;
        this.sec = sec;
    }
    
    public void add(Time t2){
        int s = this.sec+t2.sec;
        int m = this.mm+t2.mm;
        int hr = this.hh+t2.hh;
        if(s>=60){
            m = (m+(s/60));
            s-=((s/60)*60);
        }
        if(m>=60){
            hr = (hr+(m/60));
            m-=((m/60)*60);
        }
        System.out.println("Time : "+hr+" hr "+m+" min "+s+" sec ");
    }
}
