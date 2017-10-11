//二つの整数aとbを引数に実行し、a+bの結果を出力するプログラムを作成しなさい。 数字はすべてint を利用すること。 なお、出力にはprintlnを使用し、半角スペース等の出力に注意すること。

import java.util.Scanner;
class Question4{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値a：");
		int a = stdIn.nextInt();
		System.out.print("整数値b：");
		int b = stdIn.nextInt();

		System.out.println("a+b="+(a+b));
	}
}