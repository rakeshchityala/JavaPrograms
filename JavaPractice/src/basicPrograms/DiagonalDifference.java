package basicPrograms;

public class DiagonalDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a= {{11	,2	,4},
					{4	,5	,6},
					{10	,8	,-12}};
		int d1=0;
		int d2=0;
		int total=0;
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a.length;j++) {
				if (i==j) {
					//System.out.println(a[i][j]);
					d1=d1+a[i][j];					
				}
				if (i+j==(a.length-1)) {
					d2=d2+a[i][j];					
				}				
			}			
		}
		System.out.println("Diagonal total "+d1);
		System.out.println("Reverse Diagonal total "+d2);
		total=d1-d2;
		System.out.println(Math.abs(total));

	}

}
