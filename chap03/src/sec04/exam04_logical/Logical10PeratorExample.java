package sec04.exam04_logical;

public class Logical10PeratorExample {

	public static void main(String[] args) {
		int charCode = 'c';
		
		if( (charCode>=65) & (charCode<=90) ) { //�� �ڸ� ��� ��
			System.out.println("�빮�� �̱���");
		}
		if( (charCode>=97) && (charCode<=122) ) {  //���� ture�̸� �׳� ���
			System.out.println("�ҹ��� �̱���");
		}
		if( !(charCode<48) && !(charCode>57) ) {
			System.out.println("0~9 ���� �̱���");
		}
		
		int value = 6;
		
		if( (value%2==0) | (value%3==0) ) {
			System.out.println("2�Ǵ� 3�ǹ�� �̱���");
		}
		
		if( (value%2==0) || (value%3==0) ) {
			System.out.println("2�Ǵ� 3�ǹ�� �̱���");
		}
	}
}
