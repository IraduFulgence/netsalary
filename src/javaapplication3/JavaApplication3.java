/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Kib D
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
  double tax;
    double Rssb;
    double netsalary;
     double grosssalary;
     int hours;
     double salary;
     int day;
     
    public static void main(String[] args) {
        // TODO code application logic here
    
     int employeenumber;
    
     String employeename;
      int category;
    
     
     
        Scanner input = new Scanner(System.in);
        System.out.println("enter the employee name");
        employeename = input.next();
        System.out.println("enter employee number");
        employeenumber = input.nextInt();
        
      
        
      System.out.println("select type of employess: 1 for monthly, 2 for day 3 for weekly");
      category = input.nextInt();
       if(category == 1){
          Monthly net = new Monthly();
          net.monthly();
          
       }
       else if(category == 2){
           hourly net = new hourly();
           net.hours();
       }
        else if(category == 3){
           Weeky net = new Weeky();
           net.wee();
       }
      
}

   
}
