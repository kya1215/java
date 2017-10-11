import java.util.Scanner;
class middle{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値a：");
		int a = stdIn.nextInt();
		System.out.print("整数値b：");
		int b = stdIn.nextInt();
		System.out.print("整数値c：");
		int c = stdIn.nextInt();

		int min = a;
		if (b<min)
			min=b;
		if (c<min)
			min=c;
		
		int max = a;
		if (b>a)
			max=b;
		if (c>a)
			max=c;

		int middle = a;
		if (middle==min || middle==max)
			middle = b;
		if (middle==min || middle==max)
			middle = c;

		System.out.println("中央値は"+middle);

	}
}