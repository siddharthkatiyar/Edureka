
public class If_condition {
	public static void main(String[] args) {
		
		//Write a program to check if a candidate is eligible for voting or not. (Hint: Check age)
		
		int age =19;
		if(age>=18)
			System.out.println("You are eligible for voting");
		else
			System.out.println("You are below the age for voting");
		
		
		//Write a program to check if the number is positive or negative
		//Extend the previous program to check whether the given number is positive, zero or negative. (Hint: use if-else conditions)
		
		int num = -1;
		if(num>0)
			System.out.println("It is a positove integer");
		else if (num<0)
			System.out.println("It is a negative integer");
		else
			System.out.println("It is zero");
		
		
		//Write a program to find largest of two numbers.
		int a = 10;
		int b = 20;
		if(a>b)
			System.out.println("A is the largest number");
		else
			System.out.println("B is the largest number");
		
		
		//Write a program to check given number is even or odd. (Hint: use % operator)
		int x = 11;
		if(x%2==0)
			System.out.println("X is even number");
		else
			System.out.println("X is odd number");
		
	}
}
