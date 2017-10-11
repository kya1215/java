import java.util.Scanner;
class Max{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値a:");
		int a = stdIn.nextInt();
		System.out.print("整数値b：");
		int b = stdIn.nextInt();

		int max;
		if (a>b)
			max=a;
		else
			max=b;

		System.out.println("大きい方の数は"+max);
	}
}