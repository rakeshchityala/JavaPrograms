package programsOnStrings;

public class StringReverse {
	public void stringReverse(String str) {
		char[] acharArray=str.toCharArray();
		for (int i=str.length()-1;i>=0;i--) {
			
			System.out.print(acharArray[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringReverse sr= new StringReverse();
		sr.stringReverse("MyJava");
	}

}
