package javaBasic;

public class Returning_Java {

	double RR(double a, double b) {
		double sum = 0;
		sum = (a + b) / 2.0;
		return sum;
	}

	public static void main(String[] args) {
		//c1
		System.out.println(new Returning_Java().RR(5.5, 6.5));
		
		//c2
		Returning_Java ob = new Returning_Java();
		System.out.println(ob.RR(5.5,6.5));
	}
}
