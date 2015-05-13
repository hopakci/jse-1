package cmm03.flow;

import java.util.Scanner;
//avg = Math.floor(sum/3);
public class No02_IfElseDemo101 {
	public static void main(String[] args) {
		
		int kor = 0, eng = 0, math = 0 , sum = 0;
		double avg= 0.0;
		String msg = "message";
		System.out.println("");
		Scanner aaa = new Scanner(System.in);
		System.out.println("수학점수를 입력하시오.");
		math = aaa.nextInt();
		System.out.println("영어점수를 입력하시오.");
		eng = aaa.nextInt();
		System.out.println("국어점수를 입력하시오.");
		kor = aaa.nextInt();
		
		sum = math + kor + eng;
		avg = sum/3;
		
		if(avg==100){
			msg = "만점입니다";
		}else if(avg > 80){
			msg = "시험 합격입니다";
		}else{
			msg = "재시험";
		}
		

	System.out.println("국어 = "+ kor +"수학 = "+ math +"영어 = "+ eng);
	System.out.println("평균 : "+avg);
	System.out.println("시험 결과는 :"+msg);
	}
	}


