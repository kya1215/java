import java.util.Scanner;
class ensyu6_8{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数：");
		int n = stdIn.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++){
			System.out.print("a["+i+"]=");
			a[i] = stdIn.nextInt();
		}

		int sum=0;
		for (int j:a)
			sum += j;

		System.out.println("合計は"+sum);
		System.out.println("平均は"+(sum/n));
	}
}