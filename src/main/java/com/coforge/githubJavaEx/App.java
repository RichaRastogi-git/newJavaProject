package com.coforge.githubJavaEx;

import java.util.Scanner;

import com.coforge.githubJavaEx.service.EmployeeServiceImple;

/**:
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EmployeeServiceImple e= new EmployeeServiceImple();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for AddEmp and 2 for DisplayEmp");
        switch(sc.nextInt()) {
        case 1:e.addEmp();
              
        case 2:e.displayEmp();
               break;
        default:System.out.println("Requesting you to Enter only 1 or 2");       
        }
   
    }
}
