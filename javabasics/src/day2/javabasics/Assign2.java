package day2.javabasics;

public class Assign2 {
	
	static double areaofcircle(double r)
	{
	  final double pi=3.14;
	  System.out.println("area of circle method running");
	  double area=pi*r*r;
	  return area;
	}
	static double simpleintrest(double p,double i,int t) 
	{     
		System.out.println("simple intrest method running");
		double SI=p*i*t;
		return SI;	
	}
	static void degreeToFahranhit(double degreeC) 
	{
		System.out.println("Degree to Fahranhit method running");
		double F= degreeC*1.8+32;
		System.out.println("degre to F conversion is="+F);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Program start");
		System.out.println("area of circle is="+areaofcircle(3));
		System.out.println("*********************************************");
		System.out.println("simple intrest is="+ simpleintrest(1000,12,14));
		System.out.println("*********************************************");
		Assign2.degreeToFahranhit(20);
		System.out.println("*********************************************");
		//Assign2.degreeToFahranhit(20);
		System.out.println("program ends");
	}


}
