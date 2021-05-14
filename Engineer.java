/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engineer;


public class Engineer {
    
    private int Length;
    private int Height;
    
    Engineer(int X, int Y)
    {
    Length = X; 
    Height = Y;
    }
    
    public int areaCircle()
            {
                double a = 3.14 * Length * Length;
                return (int) a; 
            }
    public int areaRectangle()
            {
                int a = Length * Height;
                return a;
            }
    public void changeLength(int a){
        Length += a;
    }
    public static void main(String[] args) {
        
        Engineer rectangle = new Engineer(10,3);
        Engineer circle = new Engineer(3,0);
        circle.changeLength(3);
        rectangle.changeLength(3);
        
        System.out.println("Area of rectangle: " + rectangle.areaRectangle());
        System.out.println("Area of circle: " + circle.areaCircle());
    }
    
}
