import java.util.Random;
import java.util.Scanner;

class ensyu6_14{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		String[] monthString = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "Decenber"};

		int key;
		do{
			System.out.println("英語の月名を入力してください。");
			int m = rand.nextInt(12);
			System.out.println("問題は"+(m+1)+"月");

			String answer = stdIn.next();

			if (answer==monthString[m])
				System.out.println("正解です");
			else
				System.out.println("はずれです。");

			System.out.println("続けますか？1...yes/2...no");
			key = stdIn.nextInt();
		}while (key==1);
	}
}