package caveOfProgrammming;

public class StaticExamples {
	public final static int MYLUCKYNUMBER=7;
	public static String name;
	public String s;
	
	public static void infoMethod()
	{
		System.out.println(name);
		//System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(name);
		StaticExamples.name="Rakesh";
		StaticExamples.infoMethod();
		StaticExamples se=new StaticExamples();
		se.s="Reddy";
		System.out.println(se.s);
		System.out.println(MYLUCKYNUMBER);
		System.out.println(StaticExamples.MYLUCKYNUMBER);


	}

}
