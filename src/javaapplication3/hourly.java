/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Kib D
 */
import java.util.Scanner;
public class hourly extends JavaApplication3 {
    double bonus;
    void hours(){
        
        Scanner input = new Scanner(System.in);
    System.out.println("enter hours worked \n");
    hours= input.nextInt();
     System.out.println("enter salary per hour  \n");
   salary= input.nextDouble();
    if(hours>8){
        grosssalary= hours*salary;
        bonus= grosssalary*5/100;
        netsalary= grosssalary+bonus;
    }
    else{
        grosssalary =hours*salary;
    netsalary= hours*salary;
    }
    System.out.println("the hourly employee  salary details:\n");
      System.out.println("***************************************");
      System.out.println("***************************************");
     
      System.out.println("the employee bonus is:");
      System.out.println(bonus);
      System.out.println("the employee gross salary is:");
     System.out.println(grosssalary);
     System.out.println("the employee net salary is:");
      System.out.println(netsalary);
    }
}
