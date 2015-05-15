package cmm04.arwy;

public class No01_Array {
	public static void main(String[] args) {
		int[] intArr ;    // []:배열
		intArr = new int[10];
		
		/*
		 for (int i = 0 ; i < 10 ; i++)
		 {
		      intArr[i] = (i+1) * 100;
		      sysytem.out.printin(intArr[i]);
		 
		 }
		 
		 * */
		
		int i = 0;
		while( i < 10){
			
			intArr[i] = (i+1) * 100;
			System.out.println(intArr[i]);
			i++;
		}
	}

}
				