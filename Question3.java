//二つの整数を引数に実行し、大小の判定をするプログラムを作成しなさい。 数字はすべてint を利用すること。 
//左の数字が大きいときは"greater"、小さいときは"smaller"、同じときは"equal" と出力します。 
//なお、出力にはprintlnを使用し、半角スペース等の出力に注意すること。

import java.util.Scanner;
class Question3{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		int a = stdIn.nextInt();
		int b = stdIn.nextInt();

		if (a > b)
			System.out.println("greater");
		else if (a < b)
			System.out.println("smaller");
		else
			System.out.println("equal");
	}
}