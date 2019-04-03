
public class For_loop {
	public static void main(String[] args) {
		
		//Write a program to print 10 even numbers and 10 odd numbers.
		int counter = 1;
		int i =0;
		int j =1;
		for(counter =1; counter<=10; counter++)
			{
			System.out.println(i);
			i=i+2;
			}	
		
		for(counter =1; counter<=10; counter++)
		{
		System.out.println(j);
		j=j+2;
		}	
		
		//Write a program to find factorial of a number.
		
		int x,fact=1;  
		  int number=5;   
		  for(x=1;x<=number;x++){    
		      fact=fact*x;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact); 
		  
		  		  
		//Write a program to generate tables of 10.
		  int a=1;  
		  int num = 10;
		  int prod = 0;
		  for(a=1;a<=10;a++){    
		  prod = num * a;  
		  System.out.println("Table of "+num+" is: "+prod); 
		  }    
		  
		  
		//Write a program to add the digits of a number.
		  int numb = 321;
	        int sum = 0;
	        while (numb > 0) {
	            sum = sum + numb % 10;
	            numb = numb / 10;
	        }
	        System.out.println(sum); 
	        
	        
		//Write a program to reverse the digits of a number.
	        int numbb = 1234, reversed = 0;

	        while(numbb != 0) {
	            int digit = numbb % 10;
	            reversed = reversed * 10 + digit;
	            numbb /= 10;
	        }

	        System.out.println("Reversed Number: " + reversed);


		//Write a program to generate 10 Fibonacci numbers.
	        int maxNumber = 10; 
			 int previousNumber = 0;
			 int nextNumber = 1;
			 
		        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
	 
		        for (int i1 = 1; i1 <= maxNumber; ++i1)
		        {
		            System.out.print(previousNumber+" ");
		              
		            int sum1 = previousNumber + nextNumber;
		            previousNumber = nextNumber;
		            nextNumber = sum1;
		        }
		
	}

}
