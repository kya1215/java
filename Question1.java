//実行すると、"Hi, （人の名前）" と出力するプログラムを作成しなさい。 人の名前は実行時の引数として指定します。 
//なお、出力にはprintlnを使用し、半角スペース等の出力に注意すること。

import java.util.Scanner;
class Question1{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		String a = stdIn.next();
		System.out.println("Hi, " + a);
	}
}