package sec03.exam01_for;

public class ForMulti2 {
	public static void main(String[] args) {
		for (int m=2; m<=9; m++) {
		System.out.println("*** " + m + "단 *** " +"\t"+ "*** " + ++m + "단 *** "+"\t" + "*** " + ++m + "단 *** "+"\t"+ "*** " + ++m + "단 *** "+"\t"+ "*** " + ++m + "단 *** "+"\t"+ "*** " + ++m + "단 *** "+"\t"+ "*** " + ++m + "단 *** "+"\t"+ "*** " + ++m + "단 *** "+"\t" );
		
		int val1=2;
		int val2=3;
		int val3=4;
		int val4=5;
		int val5=6;
		int val6=7;
		int val7=8;
		int val8=9;
		for (int o=1; o<=9; o++)
			if (2<=val1) {
				System.out.println(val1 + " x " + o + " = " + (o*val1) + "\t" + val2 + " x " + o + " = " + (o*val2)+ "\t" + val3 + " x " + o + " = " + (o*val3)+ "\t" + val4 + " x " + o + " = " + (o*val4)+ "\t" + val5 + " x " + o + " = " + (o*val5)+ "\t" + val6 + " x " + o + " = " + (o*val6)+ "\t" + val7 + " x " + o + " = " + (o*val7)+ "\t" + val8 + " x " + o + " = " + (o*val8));
			}
			
		}

	}

}
