package src;
import java.util.Scanner;
public class searchTester{
	

	
	/** 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input ");
		String input=sc.nextLine();
		search test = new search("1","2","3");
		input=input.toLowerCase();
		test.splitString(input);
		System.out.println(test.getSize()+" "+test.getColor()+" "+test.getStyle()+" ");
		System.out.println(test.toString());
	}
}