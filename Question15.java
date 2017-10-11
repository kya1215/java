//浮動小数xを引数に実行し、引数の絶対値を出力するプログラムを作成しなさい。 ただし、数字はすべてdouble として扱うこと。 なお、出力にはprintlnを使用し、半角スペース等の出力に注意すること。

import java.util.Scanner;
class Question15{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("x=");
		double x = stdIn.nextDouble();

		if (x>0)
			System.out.println(x);
		else
			System.out.println((-1)*x);
	}
}