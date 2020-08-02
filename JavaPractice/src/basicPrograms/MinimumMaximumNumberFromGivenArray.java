package basicPrograms;

public class MinimumMaximumNumberFromGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[][]={{17,7,9},{4,6,2},{9,8,0}};
		int minNum=array[0][0];
		int maxNum=array[0][0];
		for(int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				if (minNum>array[i][j])
				{
					minNum=array[i][j];
				}
				if (maxNum<array[i][j])
				{
					maxNum=array[i][j];
				}
			}
		}
		System.out.println("Maximum Number is:" +maxNum);
		System.out.println("Minimum number is:" +minNum);
	}

}
