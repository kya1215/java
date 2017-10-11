import java.util.Random;
import java.util.Scanner;

class ensyu6_11{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数：");
		int n = stdIn.nextInt();
		int[] a = new int[n];

		for (int i=0; i<n; i++){
			a[i] = rand.nextInt(10) + 1;
			if (i>0){
				int j;
				do{
					for (j = 0; j<i; j++){
						if(a[j] == a[i]){
							a[i] = rand.nextInt(10) + 1;
							break;
						}
					}
				}while(a[j] == a[i]);
			}
		}

		for (int i = 0; i<n; i++){
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}
