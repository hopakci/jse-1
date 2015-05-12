package cmm02.op;

public class No02_2HangDemo {
	public static void main(String[] args) {
		int x = 20, y = 7;
		int add = 0, sub = 0, god = 0, mok = 0, nmg = 0;
		
		add = x + y;
		sub = x - y;
		god = x * y;
		mok = x / y;
		nmg = x % y;
		
		System.out.println("x + y 의 결과값 : " + add);
		System.out.println("x - y 의 결과값 : " + sub);
		System.out.println("x * y 의 결과값 : " + god);
		System.out.println("x / y 의 결과값 : " + mok);
		System.out.println("x % y 의 결과값 : " + nmg);
	}

}
