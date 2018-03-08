import java.util.Scanner;

public class Rijeci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, K;
		int prevb = 0;
		
		Scanner reader = new Scanner(System.in);
		
		K = reader.nextInt();
		
		a = 0;
		b = 1;
		
		for(int i = 1; i < K; ++i)
		{
			prevb = a;
			a = b;
			b = b + prevb;
		}
		
		System.out.println(a + " " + b);
		
	}
}
