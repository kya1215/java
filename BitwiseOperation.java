import java.util.Scanner;

class BitwiseOperation{
	static void printBits(int x){
		for (int i = 31; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1':'0');
	}

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("二つの整数を入力してください。");
		System.out.print("a:");
		int a = stdIn.nextInt();
		System.out.print("b:");
		int b = stdIn.nextInt();

		System.out.print("a     ="); printBits(a);
		System.out.print("\nb     ="); printBits(b);
		System.out.print("\na & b ="); printBits(a&b);
		System.out.print("\na | b ="); printBits(a|b);
		System.out.print("\na ^ b ="); printBits(a^b);
		System.out.print("\nn~a   ="); printBits(~a);
		System.out.print("\nn~b   ="); printBits(~b);
	}
}