
public class OneDArrays {

	public static void main(String[] args) {
		
		// Single Value Container
		int state1PopulationCount = 502;
		int state2PopulationCount = 765;
		int state3PopulationCount = 987;
		int state4PopulationCount = 456;
		int state5PopulationCount = 876;
		
		// Multi Value Container
		//int[] countryPopulation= new int[5];// All Elements were by default 0
		int[] countryPopulation = {502,765,987,456,876};// Elements have default initial value
		
		
		System.out.println("countryPopulation is :" +countryPopulation);
		
		// Read the element in Array
		// 1. Read Single Element i Array
		//System.out.println("countryPopulation[0] is :" +countryPopulation[0]);
		//System.out.println("countryPopulation[1] is :" +countryPopulation[1]);
		
		// 2. Read All
		for(int i=0; i<countryPopulation.length; i++){
			System.out.println("countryPopulation["+i+"] is :" +countryPopulation[i]);
		}
		
		//Write/Update Operations
		countryPopulation[0] =1502;
		countryPopulation[1] =1765;
		countryPopulation[2] =1987;
		countryPopulation[3] =1456;
		countryPopulation[4] =1876;
		
		System.out.println();
		System.out.println("== Re Reading After Writing Operation==");
		
		/*for(int i=0; i<countryPopulation.length; i++){
			System.out.println("countryPopulation["+i+"] is :" +countryPopulation[i]);
		}*/
		
		// Enhanced For Loop | For Each Loop
		int count =0;
		for(int elm : countryPopulation) {
			count = count+elm;
			System.out.println(elm);
		}
		
		System.out.println("Population Count for Entire Country is :"+count);
		
	}

}
