package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("what is your starting amount?");
		double startAmount = in.nextDouble();

		System.out.println("what is your win chance?");
		double winChance = in.nextDouble();

		System.out.println("what is your win limit?");
		double winLimit = in.nextDouble();
		
		System.out.println("how many simulations do you want?");
		int Simulations = in.nextInt();
		for (int count = 1; count < Simulations; count ++)
		{
		while (startAmount > 0.99 && startAmount < winLimit)
		{
			if (Math.random() > winChance) 
			{
				
				startAmount = startAmount - 1.00;
			}
			else 
			{	
							
				startAmount = startAmount + 1.00;			
			}
			

			if (startAmount < 0.99)
			{
				
				System.out.println ("Simulation: " + count + "Lose");
			}
			if (startAmount >= winLimit)
			{
				
				System.out.println ("Simulation: " + count + " Win" );

			}
		}
	
		}
	}
}

