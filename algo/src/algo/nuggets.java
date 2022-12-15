package algo;

import java.util.Scanner;

public class nuggets {
	
	public static void main(String[] args)
	{		
		Integer[][][] audit = new Integer[3][5][8];
		Integer[][] row = new Integer[3][5];
		Integer[] set = new Integer[3];
		
		for(int i = 0; i< 3;i++)
		{
			set[i] = 0;
			for(int j = 0; j< 5 ; j++)
			{
				row[i][j] = 0;
				for(int k = 0; k< 8; k++)
				{
					audit[i][j][k] = 0;
				}
			}
		}
		
		System.out.print("Enter a choice (\"Q to quit\" \"C to choose seat number\"): ");
		Scanner in = new Scanner(System.in);
		String c = in.nextLine();
		
		while(c.compareToIgnoreCase("c") == 0)
		{ 
			
			int total = set[0] + set[1] + set[2];
			if(total == 120)
			{
				System.out.println("Auditorium completely full!");
				break;
			}
			
			System.out.print("Enter your set Number[1 - 3]: ");
			int Setindex = in.nextInt();
			while(set[Setindex - 1] == 40)
			{
				System.out.println("Set fully Occupied\n");
				System.out.print("set");
				for(int i = 0; i< 3; i++)
				{
					if(set[i] != 40)
					System.out.print(" "+ (i+1)+ " ");
				}
				System.out.print("has empty seat\n");
				
				System.out.print("Enter another set Number[1 - 3]: ");
				Setindex = in.nextInt();
			}

			System.out.print("Enter your row Number[1 - 5]: ");
			int RowIndex = in.nextInt();
			while(row[Setindex][RowIndex - 1] == 8)
			{
				System.out.println("Row fully Occupied");
				System.out.print("row");
				for(int i = 0; i< 5; i++)
				{
					if(row[Setindex -1][i] != 8)
					System.out.print(" "+ (i+1)+ " ");
				}
				System.out.print("has empty seat\n");
				System.out.print("Enter another row Number[1 - 5]: ");
				RowIndex = in.nextInt();
			}
			
			System.out.print("Enter your seat Number[1 - 8]: ");
			int SeatIndex = in.nextInt();
			while(audit[Setindex - 1][RowIndex - 1][SeatIndex -1] == 1)
			{
				System.out.println("Seat occupied");
				System.out.print("seat");
				for(int i = 0; i< 8; i++)
				{
					if(audit[Setindex - 1][RowIndex - 1][i] == 0) {
						System.out.print(" "+ (i+1)+ " ");
					}
				}
				System.out.print("is empty\n");
				System.out.print("Enter another seat Number[1 - 8]:");
				SeatIndex = in.nextInt();
			}
			
			audit[Setindex - 1][RowIndex - 1][SeatIndex - 1] = 1;
			row[Setindex - 1][RowIndex - 1]++;
			set[Setindex - 1]++;
			System.out.print("Would you like to continue?\nEnter a choice(\"Q to quit\" \"C to choose seat number\"): ");
			c = in.next();
		}
		
		
		System.out.println("thank you for choosing auditScheduler\nYou may have a look at the the Auditorium structure below:");
		
		for(int i = 0; i< 3;i++)
		{
			for(int j = 0; j< 5 ; j++)
			{
				for(int k = 0; k< 8; k++)
				{
					if(audit[i][j][k] == 1) {
						System.out.print("O ");
					}
					else
					{
						System.out.print("E ");
					}
				}
				System.out.print("    ");
			}
			System.out.println();
		}
	}
}
 