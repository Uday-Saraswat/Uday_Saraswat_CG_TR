
public class TwoDArrays {

	public static void main(String[] args) {
		
		int[][] worldPopulation= {
			// states for Country1 -> 0    1     2    3    4    5   6
									{1234,4556,7898,1231,3423,3423,2323},  //0 -> Country1
									{1231,2131,3242,4324,4234},            //1 -> Country2
									{234,23423,5234,4324,2342,2342}        //2 -> Country3
								};
		System.out.println("World Population is :"+worldPopulation+" and Length is: "+worldPopulation.length);
		System.out.println("World Population[0] is :"+worldPopulation[0]+" and Length is: "+worldPopulation[0].length);
		System.out.println("World Population[1] is :"+worldPopulation[1]+" and Length is: "+worldPopulation[1].length);
		System.out.println("World Population[2] is :"+worldPopulation[2]+" and Length is: "+worldPopulation[2].length);
		
		// Read Single Element
		System.out.println("worldPopulation[0][0] :"+worldPopulation[1][2]);
		
		// Write/Update Data
		worldPopulation[1][2] = 7777;
		System.out.println("worldPopulation[1][2] :" +worldPopulation[1][2]);
		
		System.out.println();
		
		// Read All 
		for(int i=0; i<worldPopulation.length;i++) { //0 to 2
			for(int j=0; j<worldPopulation[i].length;j++) {
				System.out.print(worldPopulation[i][j]+" ");	
			}
			System.out.println();
		}
		
		int[][] arr =new int[3][5];
		//3 1-D arrays with 5 elements each
		
		System.out.println();
		
		for(int i=0; i<arr.length;i++) { //0 to 2
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");	
			}
			System.out.println();
		}
		
		//Giving Sizes , we need to put the data later.Hence data initially would be 0.
		//Giving Data First, we need no to give any size !!
		
		//Explore Enhanced for Loop on 2-D Arrays
	}
}

