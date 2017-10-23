package sessional;

import java.util.Scanner;

public class NameRepository implements Container {
	   public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};
	   double co;
	   @Override
	   public Iterator getIterator() {
	      return new NameIterator();
	   }

	   private class NameIterator implements Iterator {

		   
	      @Override
	      public Object cost() {
	    	  Scanner ali= new Scanner(System.in);
		      System.out.println("Enter the weight of package::");
		      double weight= ali.nextDouble();
		      if(weight<=5)
		      {
		    	  double co=weight*0.75;
		    	 System.out.println("you will charge::"+co);
		    	  return co;
		      }
		      if(weight>5)
		      {
		    	  double co=weight*0.50;
		    	  System.out.println("you will charge::"+co);
		    	  return co;
		    	  
		      }
		      return null;
	     }
	   }
	 }
