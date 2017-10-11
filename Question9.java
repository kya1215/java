//浮動小数xを引数に実行し、5 * x + 4 の計算結果を出力するプログラムを作成しなさい。 ただし、数字はすべてdouble として扱うこと。 なお、出力にはprintlnを使用し、半角スペース等の出力に注意すること。

import java.util.Scanner;
class Question9{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("x=");
		double x = stdIn.nextDouble();

		System.out.println("5*x + 4="+(5*x+4));
	}
}