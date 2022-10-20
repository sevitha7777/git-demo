import java.util.Scanner;

public class sum {
public static void main(String[] args)
	{
		 try (Scanner s = new Scanner(System.in)) {
			int n =s.nextInt();
			System.out.println("Number:"+n);
		int sum = 0;

		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
			
		System.out.println(sum);
		}

	}
}


