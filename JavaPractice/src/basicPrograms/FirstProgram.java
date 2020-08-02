package basicPrograms;

public class FirstProgram {
	static int a= 5;
	
	public void getData(){
		System.out.println("This message is from getData method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstProgram fp = new FirstProgram();
		SecondProgram sp=new SecondProgram();
		fp.getData();
		sp.setData();
		System.out.println(a);
		System.out.println("This message is from Main");
		
		for (int i=0;i<5;i++) {
			System.out.println("This is from first for loop started "+i);
			for (int j=0;j<5;j++){
				System.out.println("This is from Second for loop Started "+j);
				for (int k=0;k<5;k++){
					System.out.println("This is from Third for loop started "+k);
				}
				System.out.println("End of Second for loop");
			}
			System.out.println("End of third loop");
		}
		

	}

}
