import java.util.Scanner;

public class OneChickenPerPerson {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N, M;
		
		Scanner reader = new Scanner(System.in);
		
		N = reader.nextInt();
		M = reader.nextInt();
		
		int Q = M - N;
		
		if (Q > 0)
		{
			if (Q==1)
				System.out.println("Dr. Chaz will have " + Q + " piece of chicken left over!");
			else
				System.out.println("Dr. Chaz will have " + Q + " pieces of chicken left over!");
		}
		else
		{
			if (Q==-1 || Q==0)
				System.out.println("Dr. Chaz needs " + (-Q) + " more piece of chicken!");
			else
				System.out.println("Dr. Chaz needs " + (-Q) + " more pieces of chicken!");
		}
	}

}
