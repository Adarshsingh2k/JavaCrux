import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int pri=sc.nextInt();
		int rate=sc.nextInt();
		int time=sc.nextInt();
		
		float si=(pri*rate*time)/100;
		System.out.println("Simple interest ="+ si);
		
	}

}
