/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRANITA
 */
interface Area 
{  
final static float pi = 3.14F;  
float compute (float x, float Y); 
} 
class Rectangle implements Area
{  
public float compute(float x, float y)  
{   
return (x*y);  
}
 }
class Circle implements Area
 {  
 public float compute (float x, float y)
 {   
 return (pi*x*y);  
 }
 } 
class InterfaceCode
{  
public static void main(String a[])  
{   
Rectangle rect = new Rectangle();   
Circle cc = new Circle();  
 Area aa;      
 aa=rect;   
 System.out.println("Area of rectangle is = "+ aa.compute(10,20));      
 
 aa=cc;   
 System.out.println("Area of circle is = "+ aa.compute(10,20));
 } 
 }  

/*OUTPUT:
C:\Users\PRANITA\Desktop\JavaCode>javac InterfaceCode.java

C:\Users\PRANITA\Desktop\JavaCode>java InterfaceCode
Area of rectangle is = 200.0
Area of circle is = 628.0

C:\Users\PRANITA\Desktop\JavaCode>
/*
