package basicPrograms;

public class PatternToPrintTriangle {
	
	
	public void triangle() {
		for (int i=0;i<5;i++) {
			for (int j=i;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void triangle1() {
		
		for (int i=0;i<=5;i++) {
			int k=1;
			for (int j=1;j<=i;j++) {				
				System.out.print(k);
				k++;
			}			
			System.out.println(" ");
		}

	}
	
	public void triangle2() {
		for (int i=1;i<=5;i++) {
			//System.out.print(i);
			for (int j=5-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public void triangle3() {
		int k=1;
		for (int i=1;i<5;i++) {
			for (int j=i;j>0;j--) {
				System.out.print(k);
				k++;
			}
			System.out.println(" ");
		}
	}
	
	
	public void triangle4() {
		int k=3;
		for (int i=0;i<5;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print(k);
				k=k+3;
			}
			System.out.println("");
			System.out.println("\t");
		}
	}
	
	public void stairCase() {
		int n=6;
		for(int i=0; i<n;i++){    
	        for (int j= 0;j<((n-i)-1);j++){
	            System.out.print(" ");
	        }
	        for (int k=0;k<(i+1);k++){
	            System.out.print("#");
	        }
	        System.out.println(" ");
	}
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatternToPrintTriangle ptt= new PatternToPrintTriangle();
		
		//ptt.triangle();
		ptt.triangle1();
		
		//ptt.triangle2();
		//ptt.triangle3();
		//ptt.triangle4();
		ptt.stairCase();
		
	}

}
