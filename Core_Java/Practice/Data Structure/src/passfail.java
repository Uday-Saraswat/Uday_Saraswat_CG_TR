import java.util.Scanner;

public class passfail {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i=3;
        int count=0;
        int marks;
        while(i>0){
        	System.out.println("Enter Marks in three subject: ");
            marks=s.nextInt();
            if(marks>=60){
                count++;
            }
            i--;
        }
        if(count == 3){
            System.out.println("Passed");
        }
        else if(count ==2){
            System.out.println("promoted");
        }
        else if(count == 1){
            System.out.println("Failed");
        }
    }
}
