package sec02.exam01_if;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		int score = 101;
				
		if(score>100) {
			System.out.println("100점 만점입니다. 잘못된 표기 입니다.");
		}else if(score>=90) {
			System.out.println("점수가 100~90 입니다.");
			System.out.println("등급은 A 입니다.");
		}else if(score>=80) {
			System.out.println("점수가 80~89 입니다.");
			System.out.println("등급은 B 입니다.");
		}else if(score>=70) {
			System.out.println("점수가 70~79 입니다.");
			System.out.println("등급은 C 입니다.");
		}else {
			System.out.println("점수가 70 미만 입니다.");
			System.out.println("등급은 D 입니다.");
		}

	}

}
