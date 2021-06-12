package anArithmeticCalculator;
import java.util.Scanner;
public class ClaculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

        double num1 , num2, sum;
        char operator;
       
		        
        
		    	   System.out.print("\t\tCreating an Arithmetic Calculator\n");
				   System.out.print("Enter the operation as ( +, -, * , ÷ )");
				   operator = input.next().charAt(0);
				   
		         switch(operator) 
		         {
		        
		           case '+' :
		        	   System.out.print("Enter the 1st number\n");
		        	   num1 = input.nextDouble();
		        	   System.out.print("Enter the 1st number\n");
		        	   num2 = input.nextDouble();
		        	 
		                    sum = num1 + num2;
		                   System.out.print("Addtion = "+num1+"+"+num2+"="+sum);
		                   break;
		                   
		           case '-' :
		        	   System.out.print("Enter the 1st number\n");
		        	   num1 = input.nextDouble();
		        	   System.out.print("Enter the 1st number\n");
		        	   num2 = input.nextDouble();
		                    double sub = num1 - num2;
		                    System.out.print("substraction = "+num1+"-"+num2+"="+sub);
		                    break;
		           
		           case '*' :
		        	   System.out.print("Enter the 1st number\n");
		        	   num1 = input.nextDouble();
		        	   System.out.print("Enter the 1st number\n");
		        	   num2 = input.nextDouble();
		        	   
		                    double multi = num1 * num2;
		                   
		                    System.out.print("Multiplication = "+num1+"*"+num2+"="+multi);
		                    break;
		                
		           case '/' :
		        	   System.out.print("Enter the 1st number\n");
		        	   num1 = input.nextDouble();
		        	   System.out.print("Enter the 1st number\n");
		        	   num2 = input.nextDouble();
		                    double divid = num1 / num2;
		                    
		                    System.out.print("Division = "+num1+"/"+num2+"="+divid);
		                    break;
		               default :
		            	   System.out.print("Invalied operator "+operator);
		                    	break;		             	
		      }}
	}

