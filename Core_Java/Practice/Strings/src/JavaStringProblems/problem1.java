package JavaStringProblems;

public class problem1 {

	public static void main(String[] args) {
		String str = "Welcome Uday Saraswat";
		String[] strArray = str.split(" ");
		
		for(String temp: strArray) {
			System.out.println(temp);
		}
		
		for(int i=0; i<3; i++) {
			char[] s1 = strArray[i].toCharArray();
			for(int j = s1.length-1;j>=0;j--) {
				System.out.print(s1[j]);
			}
			System.out.print(" ");
		}

	}

}
