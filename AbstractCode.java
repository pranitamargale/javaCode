/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRANITA
 */
abstract class demo
 {
       abstract void sum();       
	   void add()       
	   {  
	   int a=5,b=6;          
	   System.out.println("Addition is:" +(a+b));      
	   } 
} 
	   
class data extends demo 
{      
 void sum()       
 {  
 int sum=0,n=3, p=9,q=28;   
   
     
   sum=n+p+q;  
         
 System.out.println  ("Sum is:"+sum);      
 } 
 } 
 class AbstractCode
 {      
 public static void main(String args[])     
 {  
 data d=new data();  
 d.sum();  
 d.add(); 
}
} 
/*OUTPUT
C:\Users\PRANITA\Desktop\JavaCode>javac AbstractCode.java

C:\Users\PRANITA\Desktop\JavaCode>java AbstractCode
Sum is:40
Addition is:11

C:\Users\PRANITA\Desktop\JavaCode>
*/