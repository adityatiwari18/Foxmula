/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foxmula;

/**
 *
 * @author aditya
 */
abstract class Quadrilateral{
    int x1,x2,x3,x4,y1,y2,y3,y4;

    public Quadrilateral(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.y4 = y4;
    }
    
    abstract void area();
}
class Trapezoid extends Quadrilateral{

    int height;
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
class Parallelogram extends Quadrilateral{

    int height;
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
class Rectangle extends Quadrilateral{
    
    public Rectangle(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
        super(x1, x2, x3, x4, y1, y2, y3, y4);
    }

    @Override
    void area() {
        double l = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        double b = Math.sqrt(Math.pow((x2-x3),2)+Math.pow((y2-y3),2));
        
        System.out.println("Area of Rectangle = "+(l*b));
    }
    
}
class Square extends Quadrilateral{

    public Square(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
        super(x1, x2, x3, x4, y1, y2, y3, y4);
    }
    
    @Override
    void area(){
        double side = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("Area of Square = "+(side*side));
    }
    
}
public class Shapes {

    public static void main(String[] args) {
        
        // Square
        Square s = new Square(1,1,2,2,1,2,1,2);
        s.area();
        
        //Rectangle
        Rectangle r = new Rectangle(-6,6,6,-6,2,2,0,0);
        r.area();
        
        //Trapezoid
        Trapezoid t = new Trapezoid(-2,2,6,-6,2,2,0,0,2);
        t.area();
        
        //Paralleogram
        Parallelogram p = new Parallelogram(18,48,36,6,26,26,7,7,19);
        p.area();
    }
    
}
