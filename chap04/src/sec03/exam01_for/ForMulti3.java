package sec03.exam01_for;

public class ForMulti3 {
	public static void main(String[] args) {
		for (int n=2; n<=9; n++) {
		System.out.print("*** " + n + "´Ü *** " );
			for (int m=1; m<=9; m++) {
//				System.out.print("\t");
				System.out.print(n + " x " + m + " = " + (m*n));
				System.out.println();
			}
		System.out.print();	
		}
	}
}
