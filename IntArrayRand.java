import java.util.Random;
import java.util.Scanner;

class IntArrayRand{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数：");
		int n = stdIn.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++){
			a[i] = rand.nextInt(10);
		}

		for (int i = 0; i < n; i++){
			for (int j = 0; j < a[i]; j++){
				System.out.print('*');
			}
			System.out.println();
		}
	}
}