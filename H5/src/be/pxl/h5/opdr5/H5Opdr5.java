package be.pxl.h5.opdr5;



public class H5Opdr5 {

	public static void main(String[] args) {
		int a = 2147483645;
		int b = 2147483642;
		long result;
		
		result = a * b;
		System.out.println(result);
		result = ((long) a) * b;
		System.out.println(result);
		result = (long) a * b;
		System.out.println(result);
		result = (long) (a * b);
		System.out.println(result);
		

	}

}
