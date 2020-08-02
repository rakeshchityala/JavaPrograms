package basicPrograms;

public class RepeateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="5A3B2C";
		//String s = "qwerty1qwerty2";
		for(int i=0;i<s.length();i++)
		{
		   if(Character.isDigit(s.charAt(i)))
		   System.out.print(s.charAt(i)+"  ");
		}

	}

}
