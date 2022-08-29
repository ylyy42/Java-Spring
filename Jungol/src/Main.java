import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int count = 1;
		
		while(true) {
			System.out.print(num * count + " ");
			
			if((num * count) % 10 == 0) {
				break;
			}
			count++;
			if((num * count) > 100) {
				break;
			}
		}
	}
}
