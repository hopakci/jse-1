package cmm03.flow;

import java.util.Scanner;

public class No02_IfElseDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //자바에서 클래스에 맨 앞글자는 대문자로 표기해준다.
		System.out.println("값을 입력하세요..");
		
		int i = 0;
		i = scanner.nextInt();
		System.out.println("입력값은 "+i+"입니다.");
	}

}
