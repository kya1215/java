import java.util.Scanner;
class ensyu4_11{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("0がらnまでカウントダウンします");
		System.out.print("正の整数n：");
		int n = stdIn.nextInt();

		for (int i = 0;i<n;i++){
			System.out.println(n-i);
		}
	}
}