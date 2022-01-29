import java.util.Scanner;
public class ComInterest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int p;
		double r;
		int t;
		double SI,CI;

		System.out.println("Enter Principle 'P':");
		p = s.nextInt();		
		System.out.println("Enter Rate 'r':");
		r = s.nextDouble();
		System.out.println("Enter time 't':");
		t = s.nextInt();
		
		SI = p*r*t*0.01;
		CI = p*Math.pow(1+r*0.01,t) -p;
		
		System.out.println("Simple Interest 'SI'= "+SI);
		System.out.println("Compound Interest 'CI'= "+CI);		

	}

}
