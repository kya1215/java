import java.util.Scanner;
class ensyu4_13{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数n：");
		int n = stdIn.nextInt();

		int sum=0;
		String text="";
		for(int i = 1;i<n;i++){
			sum += i;
			text += i + "+";
		}
		sum += n;
		text += n + "=";
		System.out.println(text+sum);
	}
}