import java.util.Scanner;

public class SimonSays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, numAct;
		String Simon;
		String[] action;
		
		Scanner reader = new Scanner(System.in);
		
		Simon = reader.nextLine();
		n = Integer.parseInt(Simon);
		
		numAct = 0;
		action = new String[n];
		
		for(int i = 0; i < n; ++i)
		{
			Simon = reader.nextLine();
			if (Simon.contains("Simon says"))
			{
				action[numAct] = Simon.replace("Simon says ", "");
				numAct++;
			}
				
		}
		
		for (int i=0; i < numAct; ++i)
		{
			System.out.println(action[i]);
		}
	}

}
