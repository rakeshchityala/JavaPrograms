package basicPrograms;

import java.util.ArrayList;

public class HackerRankMiniMaxSum {
	public void miniMaxSum(int arr[]) {
		for (int i : arr) {
			System.out.println(arr[i-1]);
			java.util.Date today = new java.util.Date();
			java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
			String todayStr = sdf.format(today);
			System.out.println(todayStr);
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HackerRankMiniMaxSum hrmm= new HackerRankMiniMaxSum();
		int[] arr= {1,2,3,4,5};
		hrmm.miniMaxSum(arr);

	}

}
