package sec03.exam03_accuracy;

public class FromIntToFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;     // num3 = 123456780
		//double num3 = num2;   float는 8비트라서 저 숫자를 모두 표현못하므로 오류값이 나오는것
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
	}
}
