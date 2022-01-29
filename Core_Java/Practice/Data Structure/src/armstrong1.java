import java.util.Scanner;
public class armstrong1 {

    public static void main(String[] args) {

        int n, z, mod, total = 0;
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		n= sc.nextInt();		

        z = n;
        while (z != 0)
        {
            mod = z % 10;
            total = total + mod*mod*mod;
            z /= 10;
        }
        
        if(total == n)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is not an Armstrong number");
    }
}