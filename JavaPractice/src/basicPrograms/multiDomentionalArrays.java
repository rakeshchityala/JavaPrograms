package basicPrograms;

public class multiDomentionalArrays {
	public void multiDimentionalArray() {
		int[] values ={3, 5, 12};
		System.out.println(values [2]);
		
		int [][] grid = {
				{1, 2,3},
				{5,6},
				{7,8,9,10}
		};
		System.out.println(grid[1][1]);
		String [][] texts= new String [2][3];
		
		texts[0][1]="hello there";
		System.out.println(texts[0][1]);
		
		for (int i=0; i<grid.length; i++){
			for (int j=0;j<grid[i].length;j++){
				System.out.println(grid[i][j]+ "\t");
			}
			System.out.println();
		}
	}
	
	public void smallestNumberMutiDimentionArray() {
		int[][] b= {{1,2,3},{4,5,6},{7,8,9}};		
		int min=b[0][0];
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++){
				//System.out.print(b[i][j]);
				if(b[i][j]<min) {
					min=b[i][j];					
				}				
			}			
		}
		System.out.println(min);
	}
	public void maxNumberMutiDimentionArray() {
		int[][] b= {{1,2,3},{4,5,6},{7,8,9}};		
		int max=b[0][0];
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++){
				//System.out.print(b[i][j]);
				if(b[i][j]>max) {
					max=b[i][j];					
				}				
			}			
		}
		System.out.println(max);
	}
	
	
	public void maxAndMinNumberMutiDimentionArray() {
		int minNumber=0;
		int k=0;
		int[][] b= {{1,2,3},{4,5,6},{7,8,9}};		
		int max=b[0][0];
		int min=b[0][0];
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++){
				//System.out.print(b[i][j]);
				if(b[i][j]<min) {
					min=b[i][j];
					k=min;
				}				
			}			
		}
		
		while (k<3) {
			if (b[k][minNumber]>min) {
				max=b[k][minNumber];
			}
			k++;
		}
		System.out.println(max);
	}
	
	public static void main (String args[]){
		
		multiDomentionalArrays mda=new multiDomentionalArrays();
		mda.smallestNumberMutiDimentionArray();
		mda.maxNumberMutiDimentionArray();
		mda.maxAndMinNumberMutiDimentionArray();
		
		
	}
}
