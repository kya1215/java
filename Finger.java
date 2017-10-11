import java.util.Scanner;
import java.util.Random;
class Finger{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		int player;
		int com;

		do{
			System.out.print("手を選べ 0/グー、1/チョキ、2/パー：");
			player = stdIn.nextInt();
			com = rand.nextInt(3);

			if (player == com)
				System.out.println("あいこ");
			else
				if ((player == 0 && com == 1) || (player == 1 && com == 2) || (player == 2 && com == 0)){
					System.out.println("computer："+com);
					System.out.println("あなたの勝ち");
				}
				else{
					System.out.println("computer："+com);
					System.out.println("あなたの負け");
				}
		}while (player==com);

	}
}