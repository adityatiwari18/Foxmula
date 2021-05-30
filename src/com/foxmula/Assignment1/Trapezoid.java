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
class Trapezoid extends Quadrilateral{

    private int height;
    public Trapezoid(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4, int height) {
        super(x1, x2, x3, x4, y1, y2, y3, y4);
        this.height=height;
    }

    @Override
    void area() {
        double h1 = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        double h2 = Math.sqrt(Math.pow((x4-x3),2)+Math.pow((y4-y3),2));
        System.out.println("Area of Trapezoid = "+(((h1+h2)*height)/2));
    }
    
    
}