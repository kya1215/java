import java.util.Scanner;

class ensyu7_1{

	static int sign0f(int n){
		int answer;
		if (n>0)
			answer = 1;
		else if (n<0)
			answer = -1;
		else
			answer = 0;
		return answer;
	}

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数を入力してください。");
		int n = stdIn.nextInt();
		System.out.println(sign0f(n));
	}
}