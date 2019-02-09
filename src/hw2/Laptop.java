package hw2;

public class Laptop {

	public String myLaptop;
	public int num1;
	public double version;
	public static String price;
	public static int years;
	
	public Laptop(String myLaptop){
		this.myLaptop = myLaptop;
		System.out.println(myLaptop);
	}
	
	public Laptop(int myLaptop){
		this.num1 = num1;
		System.out.println("I have " + myLaptop + " MacBook.");
	}
	
	public Laptop(double version){
		this.version = version;
		System.out.println("I have version " + version );
	}

	public static void pricing(){
		price = "The laptop cost $1500.";
		System.out.println(price);
	}
	public static void years(){
		years = 3;
		System.out.println("I've had my laptop for " + years + " years");
	}
}
