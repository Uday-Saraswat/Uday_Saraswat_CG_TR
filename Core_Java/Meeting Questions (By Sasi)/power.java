
public class power {

	public static void main(String[] args) {
		pow pows = new pow();
		System.out.println(pows.power(110, 3));
		System.out.println(pows.power(230,10));
		System.out.println(pows.power(480, 20));

	}

}

class pow{
	public int power(int voltage,int current) {
		return voltage*current;
	}
}

