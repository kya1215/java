import java.util.Random;
import java.util.Scanner;

class ensyu7_8{
	static int random(int a, int b){
		Random rand = new Random();
		
		int c;
		if(b>a){
			c = rand.nextInt(b-a+1)+a;
			return c;
		}
		else
			return a;
	}

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("a以上b以下の乱数を表示します。");
		System.out.print("整数a：");
		int a = stdIn.nextInt();
		System.out.print("整数b：");
		int b = stdIn.nextInt();
		System.out.println(random(a,b));
	}
}