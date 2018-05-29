// Copy and paste your work, or start typing.import java.util.*;
import java.lang.*;
import java.util.Scanner;
import java.io.*;

public class Flyer
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   //Create a scanner object
       Scanner input = new Scanner(System.in);
       
      //Declare other required variables
      boolean validNumber = true;
      int ordertype = 1;
      int storeZipCode = 60446;
      int customerZipCode = 60446; //Assuming default
      int deliveryCharge = 0; 
      boolean keepOrdering = true; 
      double orderTotal = 0;
      int userSelection = 0;
      double totalCost = 0;
      
     //Ask customer for pick-up or delivery
     while(validNumber)
     { 
    	 System.out.println("Enter 1 for Pick-up and Enter 2 for Delivery");
   		 ordertype = input.nextInt();
       
      if (ordertype == 1)
        {    
        System.out.println("Pick-Up");  
        validNumber = false;    
        }
      else if ( ordertype == 2)
        {
        System.out.println("Delivery");
        validNumber = false;
       }
     }  
      
     //If delivery, ask for zip code and do the comparison of zip code
      if (ordertype == 2)
      {
        System.out.println("Please enter your zipcode:");
        customerZipCode = input.nextInt();
        if ( (customerZipCode >= 60442) && (customerZipCode <= 60450) )
      {
          deliveryCharge = 5; 
        System.out.println("Delivery Available. Delivery charge will be: $" + deliveryCharge);
          
      }
         else if( (customerZipCode == 60451 ) || (customerZipCode == 60441 ) )
     {
           		deliveryCharge = 7; 
                System.out.println("Delivery Available. Delivery charge will be: $" + deliveryCharge);
      }          
        else 
        {
        	System.out.println("Delivery Not Available. You will have to pick it up."); 
          	deliveryCharge = 0;
        } 
      }
      
      
      //in a while loop
    	  
      //while(keepOrdering)
      {
      //Print the menu 
    	  
      System.out.println("Enter 1 for Flyers' Burger: $4.50 per an order");
      System.out.println("Enter 2 for Flyers' Drink: $1.50 per a container");
      System.out.println("Enter 3 for Flyers' Fries: $ 2.50 per an order");
      System.out.println("Enter 4 Flyers' Dessert: $ 3.00 per an order"); 
      } 
        //Take the user selection 
       if ( userSelection == 1 )
       {
       orderTotal = orderTotal + 4.50 ; 
       }
        else if (  userSelection == 2 )
        {
       orderTotal = orderTotal + 1.50; 	
        }
       
        else if (  userSelection == 3 )
        {
        orderTotal = orderTotal + 2.50;
        }
       
        //else if (  userSelection == 4 )
       // {
       // orderTotal = orderTotal + 3.00;
       // }
            else 
      
     //Ask user if they want to enter more (this will be if statement) 
           {
            	System.out.println("To keep ordering enter 1");
            	ordertype = input.nextInt();
            	keepOrdering = false;
           
       

      //TotalCost = oderTotal * tax + deliveryCharge ;
      totalCost = orderTotal * .5 + deliveryCharge;
	}
}
}	