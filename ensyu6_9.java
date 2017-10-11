import java.util.Scanner;
import java.util.Random;

class ensyu6_9{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数：");
		int n = stdIn.nextInt();
		int[] a = new int[n];

		for (int i = 0; i<n; i++){
			a[i] = 1+rand.nextInt(10);
			while (i > 0 && a[i]==a[i-1])
				a[i] = 1+rand.nextInt(10);
			System.out.println("a["+i+"]=" + a[i]);
		}
	}
}