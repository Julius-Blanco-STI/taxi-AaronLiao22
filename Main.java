import hw2.Taxi;
public class Main {    
    public static void main(String[] args) {
    	Taxi x = new Taxi("NEW123");
    	x.run("I will go to Makati");
    	x.printCurrentLocation();
    	//x: 10, y: 10
    	x.book(10, 10);
    	x.run("I am leaving on a jetPlane");
    	x.reachedDestination();
        System.out.println("Your plate number is " + x.getTaxi());
        System.out.println(x.reachedDestination());
    }
}
