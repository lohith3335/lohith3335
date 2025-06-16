package ABC;

public class Greedyalgorithm {
	

	
	    static class Transport {
	        String name;
	        int time;
	        int cost;

	        Transport(String name, int time, int cost) {
	            this.name = name;
	            this.time = time;
	            this.cost = cost;
	        }
	    }

	    public static void main(String[] args) {
	        Transport[] options = {
	            new Transport("Flight", 1, 5000),
	            new Transport("Train", 15, 1000),
	            new Transport("Bus", 30, 500),
	        };

	        Transport best = options[0];

	        for (int i = 1; i < options.length; i++) {
	            // Choose the transport with minimum time
	            if (options[i].time < best.time) {
	                best = options[i];
	            }
	        }

	        System.out.println("Best option to reach fast to GOA:");
	        System.out.println("Transport: " + best.name);
	        System.out.println("Time: " + best.time + " Hours");
	        System.out.println("Cost: " + best.cost);;
}
	}


