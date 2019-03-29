/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;
import static java.time.Clock.system;

/**
 *
 * @author Kib D
 */

public class Monthly extends JavaApplication3{
    void monthly (){
        Scanner input = new Scanner(System.in);
    
    System.out.println("enter the salary");
      grosssalary = input.nextDouble();
      
      tax = grosssalary*25/100;
      Rssb = grosssalary*5/100;
      netsalary=grosssalary-tax-Rssb;
      System.out.println("the monthly employee  salary details:\n");
      System.out.println("***************************************");
      System.out.println("***************************************");
      
      System.out.println("the employee tax is:\n");
      System.out.println(tax);
      System.out.println("the employee RSSB is:\n");
     System.out.println(Rssb);
     System.out.println("the employee gross salary is:\n");
     System.out.println(grosssalary);
     System.out.println("the employee net salary is:\n");
      System.out.println(netsalary);
              }}
