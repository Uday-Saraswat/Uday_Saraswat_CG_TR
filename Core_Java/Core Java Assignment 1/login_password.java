import java.util.Scanner;

public class login_password {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);	
		
		String user,pass;
		int attempts = 0;

		do
		{
			System.out.print("Enter a Username: ");
			user = scanner.next();

			System.out.print("Enter a Password: ");
			pass = scanner.next();
			
			attempts++;
		}
		while (!user.equals("Uday") && !pass.equals("Saraswat") && 
				attempts != 3);

		if (attempts==3)
			System.out.println("Invalid Credentials,Contact Admin");
		else
			System.out.println("Welcome "+user);

	}
}