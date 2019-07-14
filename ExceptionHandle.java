/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRANITA
 */
class ExceptionHandle{  
  void m(){  
    int data=50/0;  
  }  
  void n(){  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }
   catch(Exception e){
   System.out.println("exception handled");
   }  
  }  
  public static void main(String args[]){  
   ExceptionHandle obj=new ExceptionHandle();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  

/*OUTPUT:
C:\Users\PRANITA\Desktop\JavaCode>javac ExceptionHandle.java

C:\Users\PRANITA\Desktop\JavaCode>java ExceptionHandle
exception handled
normal flow...

C:\Users\PRANITA\Desktop\JavaCode>
/*