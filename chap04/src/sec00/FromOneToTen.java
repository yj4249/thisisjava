package sec00;

public class FromOneToTen {

	public static void main(String[] args) {
		int i = 0;
		int total = 0;
		// i �� ��Ƽ�������� ���� �ʾƵ� ��Ƽ���� �ν���
		for(i=1; i<=10; i++) {
			System.out.print(i);
			total = total + i;
			if(i<10) {
				System.out.print("+");
//			}else {
//				System.out.print("=" + total);
			}
		
		}
		System.out.print("=" + total);
	}

}
