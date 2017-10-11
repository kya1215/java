import java.util.Random;
import java.util.Scanner;

class ensyu6_4{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数：");
		int n = stdIn.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++){
			a[i] = 1+rand.nextInt(10);
			System.out.println("a["+i+"]="+a[i]);
		}

		for (int j = 0; j < 10; j++){
			for (int i = 0; i<n; i++){
				if (a[i]>=10-j)
					System.out.print('*');
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 0; i<n; i++){
			System.out.print("-");
		}
		System.out.println();
		for (int i = 0; i<n; i++){
			System.out.print(i%10);
		}
	}
}