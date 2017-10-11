import java.util.Scanner;
class ensyu4_12{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("nから0までカウントダウンします");
		System.out.print("正の整数n：");
		int n = stdIn.nextInt();

		for (int i = n;i>=0;i--){
			System.out.println(i);
		}
	}
}