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
import java.io.*;
 class SuperClass 
{
  public void display(int x)  
  { 
      System.out.println("Value of X is"+x);
  } 
}
class SubClass extends SuperClass { 
 public void display(int y)  
 {  
     System.out.println("Value of Y is:"+y); 
 } 
 } 
public  class Override 
{
  public static void main(String args[]) 
  {  
  SubClass s=new SubClass();  
  s.display(10);   
  SuperClass s1=new SuperClass();   
  s1.display(20);  
  }
} 

/*OUTPUT:
C:\Users\PRANITA\Desktop\JavaCode>javac Override.java

C:\Users\PRANITA\Desktop\JavaCode>java Override
Value of Y is:10
Value of X is20

C:\Users\PRANITA\Desktop\JavaCode>*/
