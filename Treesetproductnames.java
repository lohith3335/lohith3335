package ABC;
import java.util.*;
public class Treesetproductnames {

	public static void main(String[] args) {
		TreeSet<String>productnames=new TreeSet<>();
		Scanner sc=new Scanner(System.in);
		productnames.add("keyboard");
		productnames.add("mouse");
		productnames.add("monitor");
		productnames.add("cpu");
		System.out.println("Available productnames:"+productnames);
		System.out.println("Enter product to search:");
		String input=sc.nextLine();
		if(productnames.contains(input)) {
			System.out.println("Found:"+input);
			
		}
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
