package ABC;
public class Linearsearchexample {
	
public static void main(String[] args) {
	int[] numbers= {2,4,6,8,10,9};
	int target=9;
	boolean found = false;
	for(int i=0;i<numbers.length;i++){
		if(numbers[i]==target) {
		System.out.println("Found"+target+"at index"+i);
		found=true;
		break;
	}
	}

    if(!found) {
    	System.out.println("Number"+target+"not found");
      }
}
}

	