package p1;

import java.util.Scanner;

public class Executor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Go to Events\n2.exit");
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				System.out.println("Enter Your Roll:: ");
				String roll = sc.nextLine();
				if(roll.length()==10)
				{
					options(sc,roll);
				}
				else
					System.out.println("Invalid Roll");
				break;
			case 2:
				System.out.println("Thankyou");
				sc.close();
				System.exit(0);
			}
			
		}
		
	}

	private static void options(Scanner sc,String roll) {
		System.out.println("1.Take Year by Roll\n2.Select Year");
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
			switch(roll.substring(0, 2))
			{
			case "21":
				eventsby2021(getBranch(roll));
				break;
			case "22":
				eventsby2022(getBranch(roll));
				break;
			default:
				System.out.println("No Events found By year");
			}
			break;
		case 2:
			System.out.println("1.Year: 2021,2. Year: 2022");
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				eventsby2021(selectbr(sc));
				break;
			case 2:
				eventsby2022(selectbr(sc));
			}
		}
	}
	private static int selectbr(Scanner sc) {
		System.out.println("1.Cse\n2.Ece\n3.mec");
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
			return 1;
		case 2:
			return 2;
		case 3:
			return 3;
		default:
			return 0;
		}
	}

	private static void eventsby2021(int choice)
	{
		switch(choice)
		{
		case 1:
			System.out.println("Hackathon,DBMS");
			break;
		case 2:
			System.out.println("PCB,VSLI");
			break;
		case 3:
			System.out.println("FM,Automobile");
		default:
			System.out.println("Invalid Branch Selection");
		}
	}
	private static void eventsby2022(int choice) {
		switch(choice)
		{
		case 1:
			System.out.println("Hackathon,DBMS");
			break;
		case 2:
			System.out.println("PCB,VSLI");
			break;
		case 3:
			System.out.println("FM,Automobile");
		default:
			System.out.println("Invalid Branch Selection");
		}
	}
	private static int getBranch(String roll)
	{
		switch(roll.toLowerCase().substring(2,5))
		{
		case "cse":
			return 1;
		case "ece":
			return 2;
		case "mec":
			return 3;
		default:
			System.out.println("Not Branch Found");
			return 0;
		}
	}
}
