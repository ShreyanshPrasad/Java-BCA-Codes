import java.util.Scanner;

public class DemoScanner{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int no;

		System.out.println("Enter a no: ");
		no = sc.nextInt();
		
		System.out.println("The entered no is " + no); 
	}

}