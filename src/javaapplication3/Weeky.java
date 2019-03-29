/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;

/**
 *
 * @author Kib D
 */
public class Weeky extends JavaApplication3 {
     
     double bonus;
   void wee(){
       Scanner input= new Scanner(System.in);
       System.out.println("Enter days worked in weeks:");
       day= input.nextInt();
       System.out.println("Enter salary for  day :");
       salary= input.nextDouble();
       if(day>5){
       grosssalary= day*salary;
       bonus= grosssalary*12/100;
       netsalary= grosssalary+bonus;
       }
       else{
       grosssalary= day*salary;
       netsalary= grosssalary;
       }
           System.out.println("the weekly employee  salary details:\n");
      System.out.println("***************************************");
      System.out.println("***************************************");
     System.out.println("use rate of 12% for employee worked more than 5 days as bonus:");
      System.out.println("the employee bonus is:");
      System.out.println(bonus);
      System.out.println("the employee gross salary is:");
     System.out.println(grosssalary);
     System.out.println("the employee net salary is:");
      System.out.println(netsalary);

   } 
}
