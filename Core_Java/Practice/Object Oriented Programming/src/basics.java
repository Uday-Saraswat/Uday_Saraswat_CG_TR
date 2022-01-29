
import encapsulation.EncapsulationIntro;

public class basics {

	public static void main(String[] args) {
		
//		Person p1 = new Person();
//		p1.name = "Uday";
//		p1.age = 21;
		
//		Person p2 = new Person(31, "Uday Saraswat");
		
		
//		System.out.println("My name is "+p1.name+" and i am "+p1.age+" years old");
//		System.out.println("My name is "+p2.name+" and i am "+p2.age+" years old");
		
//		p1.eat();
//		p2.walk();
//		p2.walk(2);
		
//		System.out.println(Person.count);
		
//		Developer d1 = new Developer(24,"Raja");
//		d1.walk();
		
//		EncapsulationIntro obj = new EncapsulationIntro();
//		obj.doWork();
		
		
	}

}

class Developer extends Person{

	public Developer(int age, String name) {
		super(age, name);
		
	}
	void walk() {
		System.out.println("Developer"+ name + " is walking.");
	}	
	
}

class Person{
	protected String name;
	int age;
	
	static int count;
	
	//Normal Constructor
//	public Person(){
//		count++;
//		System.out.println("Creating an Object");
//	}
	
	//Overload constructor
	public Person(int age, String name) { 
		this.name = name;
		this.age = age;		
	}
	
	void walk() {
		System.out.println(name + " is walking.");
	}	
	void eat() {
		System.out.println(name + " is eating.");
	}
	void walk(int steps) {
		System.out.println(name + " walked "+steps + " Steps");
	}
	void doWork() {
		System.out.println("Person is working.");
	}
}