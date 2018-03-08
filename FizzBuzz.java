import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, N;
		
		Scanner reader = new Scanner(System.in);
		
		x = reader.nextInt();
		y = reader.nextInt();
		N = reader.nextInt();
		
		for(int i = 0; i < N; ++i)
		{
			int number = i+1;
			if(number % x == 0)
				System.out.print("Fizz");
			if(number % y == 0)
				System.out.print("Buzz");
			if(number % x != 0 && number % y != 0)
				System.out.print(number);
			System.out.println();
		}
	}

}
