import java.util.Scanner;

class IsoscelesTriangleRB{
	static void putChars(char c, int n){
		while (n-- > 0)
			System.out.print(c);
	}

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("右下直角の三角形を表示します。");
		System.out.print("段数は：");
		int n = stdIn.nextInt();

		for (int i = 1; i<=n; i++){
			putChars(' ', n-i);
			putChars('+', i);
			System.out.println();
		}
	}
}