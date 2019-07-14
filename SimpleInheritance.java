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
class BaseClass {
    
    int eid;
    String name;
    Scanner s= new Scanner(System.in);
    void getData()
    {
     System.out.println("Enter employee ID:");
     eid=s.nextInt();
     System.out.println("enter name of the Employee:");
     name=s.next();
    }
    
}

class DerivedClass extends BaseClass
{
     void putData()
     {
         super.getData();
         System.out.println("Employee ID is:"+super.eid);
         System.out.println("Employee name is:"+super.name);
     }
}

public class SimpleInheritance
{
    public static void main(String args[])
    {
        BaseClass b=new BaseClass();
        b.getData();
        DerivedClass d=new DerivedClass();
        d.putData();
    }
}

    
/*OUTPUT:
C:\Users\PRANITA\Desktop\JavaCode>javac SimpleInheritance.java

C:\Users\PRANITA\Desktop\JavaCode>java SimpleInheritance
Enter employee ID:
1
enter name of the Employee:
pranita
Enter employee ID:
2
enter name of the Employee:
Priyanka
Employee ID is:2
Employee name is:Priyanka

C:\Users\PRANITA\Desktop\JavaCode>*/

