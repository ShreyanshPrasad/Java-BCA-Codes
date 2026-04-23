import java.util.Scanner;

class ProblemIntString {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		sc.nextLine();   // consume leftover enter
		System.out.print("Enter Name: ");
		String name = sc.nextLine();

		System.out.println("Hi! " + name + ", you are " + age + "years old.!");

	}
}