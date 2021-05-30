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
class Parallelogram extends Quadrilateral{

    private int height;
    public Parallelogram(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4, int height) {
        super(x1, x2, x3, x4, y1, y2, y3, y4);
        this.height=height;
    }

    @Override
    void area() {
        double side = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("Area of Parallelogram = "+(side*height));
    }
    
}