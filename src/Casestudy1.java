
public class Casestudy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 11;
		double cost = 400;
		if(number>10)
		{
			cost = 0.9*cost*number;
			System.out.println("Cost of "+number+" tickets is "+cost);
		}
		else
		{
			cost = cost *number;
			System.out.println("Cost of "+number+" tickets is "+cost);
		}

	}

}
