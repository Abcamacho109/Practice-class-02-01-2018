import java.util.Scanner;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner (System.in);

System.out.println("Enter Your First Name");

String firstname = scanner.nextLine();

System.out.println("Enter Your Last Name");

String lastname = scanner.nextLine();

System.out.println("Enter Your Middle Initial");

String middleinitial = scanner.nextLine();

System.out.println("Enter Your Career");

String career = scanner.nextLine();

System.out.println("Enter your age");

int age = scanner.nextInt();


Human Person = new Human(firstname, lastname,middleinitial,career,age);
System.out.println(Person.firstname  +Person.lastname  +Person.middleinitial  +Person.career  +Person.yearsold);
	

	}

}
