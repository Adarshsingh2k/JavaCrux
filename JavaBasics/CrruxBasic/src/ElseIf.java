import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int age=sc.nextInt();
		if(age<11) System.out.println("Kid");
		else if (age>=11 && age<=18) System.out.println("Teenager");
		else System.out.println("Adult");

	}

}
