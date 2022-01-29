
public class Interfaces implements Car,Persons {

	public static void main(String[] args) {
		
	}

	@Override
	public void start() {
		System.out.println("my car is starting");
	}

	@Override
	public void walk() {
		System.out.println("person is Walking");
	}

}

interface Car{
	
	void start();
	
}

interface Persons{
	void walk();
}

