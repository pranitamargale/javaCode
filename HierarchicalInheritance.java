/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRANITA
 */

import java.util.*;
class Area1
{
    int l,b,r,side;
    Scanner s=new Scanner(System.in);
    void calArea()
    {
        l=10;
        b=2;
        side=40;
        System.out.println("This is super class");
        System.out.println("Area of rectangle is:"+(l*b));
        
    }
}
class Sqr extends Area1
{
    
    void calArea()
    {
        super.side = 40;
        //super.calArea();
        System.out.println("This is subclass 1");
        System.out.println("Area of square is:"+(super.side*super.side));
        
    }
}
class circle extends Area1
{
    void calArea()
    {
        super.r=3;
        System.out.println("This is subclass 2");
        System.out.println("Area of circle is:"+(3.14*super.r*super.r));
        
    }
}
public class HierarchicalInheritance {
    public static void main(String args[])
    {
        Area1 a=new Area1();
        a.calArea();
        Sqr p=new Sqr();
        p.calArea();
        circle c=new circle();
        c.calArea();
        
        
    }
    
}


/*OUTPUT:
C:\Users\PRANITA\Desktop\JavaCode>javac HierarchicalInheritance.java

C:\Users\PRANITA\Desktop\JavaCode>java HierarchicalInheritance
This is super class
Area of rectangle is:20
This is subclass 1
Area of square is:1600
This is subclass 2
Area of circle is:28.259999999999998

C:\Users\PRANITA\Desktop\JavaCode>
/*