package d0327;

public class Calculator2 {

	double areaRectangle(double width) {
		return width*width;
	}
	
	double areaRectangle(double width, double height) {
		return width*height;
	}
	
	double areaRectangle(double length, double width, double height) {
		return (width*height*2)+(width*length*2)+(length*height*2);
	}
	
	public static void main(String[] args) {
		Calculator2 myCalc = new Calculator2();
		
		double result1 = myCalc.areaRectangle(4.0);
		double result2 = myCalc.areaRectangle(4.0, 6.0);
		double result3 = myCalc.areaRectangle(2.0, 3.0, 4.0);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	}

}
