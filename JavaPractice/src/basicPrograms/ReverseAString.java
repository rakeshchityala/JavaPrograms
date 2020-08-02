package basicPrograms;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "Rakesh";
		String dummy="";
		for (int i=s.length()-1;i>=0;i--){
			dummy=dummy+s.charAt(i);
			
			//String revere = stringAfterReverse;			
	}
	System.out.print(dummy);
		if(dummy.equals(s)){
			System.out.println(" Given String is a Polindrome");
		}else{
			System.out.println(" Given string is not a Polindrome");
		}
	}
}

