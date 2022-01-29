
public class armstrong2 {

	public static void main(String[] args) {
		System.out.println("Armstrong Numbers between 100-999 : ");
		
		int sum=0,n,i,mod;
		for(n=100;n<1000;n++) {
			i=n;
			while(i>0) {
				mod = i%10;
				sum=sum+mod*mod*mod;
				i=i/10;
				
			}
			
			System.out.println(n);
			
		}

	}

}
