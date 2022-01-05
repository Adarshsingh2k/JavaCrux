import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int div = 2;
		boolean flag = true;
		while (div <= n - 1) {
			if (n % div == 0) {
				flag = false;
				break;
			}
			div++;
		}
		if(flag== true) System.out.println("Prime");
		else System.out.println("Not Prime");
	}

}
