package sec01.exam01_variable;

public class VariableScopeExample2 {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10){
			int v2;
			v2 = v1 - 10;
		}
//		int v3 = v1 + v2 + 5;
		int v3 = v1 + v1 + 5;
		System.out.println(v3);
//		v2는 if절 안에서 끝난 변수라 if절 밖에선 쓸 수 없다.
	}

}
