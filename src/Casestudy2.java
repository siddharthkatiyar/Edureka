
public class Casestudy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ticket = 'g';
		int costg = 200;
		int costs = 150;
		int number =2;
		int total_cost = 0;
		
		if (ticket == 'g')
		total_cost = costg*number;
		else if (ticket == 's')
		total_cost = costs*number;
		else
			System.out.println("Invalid Option");
		
		System.out.println(" The total cost of "+number+" tickets is " +total_cost);
	}

}
