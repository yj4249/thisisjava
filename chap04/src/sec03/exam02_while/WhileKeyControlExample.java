package sec03.exam02_while;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int KeyCode = 0;
		
		while(run) {
			if(KeyCode!=13 && KeyCode!=10) {
				System.out.println("-------------------------");
				System.out.println("1. ���� | 2. ���� | 3. ����");
				System.out.println("-------------------------");
				System.out.println("���� : ");
			}
			
			KeyCode = System.in.read();
			
			if(KeyCode == 49) {//1
				speed++;
				System.out.println("���� �ӵ� =" + speed);
			}else if(KeyCode == 50) {//2
				speed--;
				System.out.println("���� �ӵ� =" + speed);
			}else if(KeyCode == 51) {//3
				run = false;
			}
			
		}
		
		System.out.println("���α׷� ����");
	}

}
