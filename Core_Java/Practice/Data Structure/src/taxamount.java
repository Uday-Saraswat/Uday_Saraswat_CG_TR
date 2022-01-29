import java.util.Scanner;
public class taxamount {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int ctc;
		System.out.println("Enter CTC : ");
		ctc = t.nextInt();
		if(ctc<=180000) {
			System.out.println("Tax Amount :" +0);
		}
		else if(ctc>=181001 && ctc<=300000) {
			System.out.println("Tax Amount : "+ctc*0.1);
		}
		else if(ctc>=300003 && ctc<=500000) {
			System.out.println("Tax Amount : "+ctc*0.2);
		}
		else if(ctc>=500001 && ctc<=1000000) {
			System.out.println("Tax Amount : "+ctc*0.3);
		}
		
	}

}
