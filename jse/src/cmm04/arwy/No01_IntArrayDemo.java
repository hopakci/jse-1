package cmm04.arwy;

public class No01_IntArrayDemo {
	public static void main(String[] args) {
		int[] intArr;                                           // [] : 배열
		intArr = new int[10];                           // new : 새메모리 할당

		intArr[0] = 100;
		intArr[1] = 200;
		intArr[2] = 300;
		intArr[3] = 400;
		intArr[4] = 500;
		intArr[5] = 600;
		intArr[6] = 700;
		intArr[7] = 800;
		intArr[8] = 900;
		intArr[9] = 1000;
		
		System.out.println(intArr[10]);
	}
}