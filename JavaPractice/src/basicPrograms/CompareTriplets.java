package basicPrograms;

public class CompareTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int k=0;
		int Alice=0;
		int Bob=0;
		int a[]= {5,6,7};
		int b[]= {3,6,10};
		for (int i=0;i<a.length;i++) {
			if(a[i]>b[i]) {
				System.out.println(Alice++);				
			}else if (a[i]<b[i]) {
				System.out.println(Bob++);
			}else if (a[i]==b[i]) {
				System.out.println(Alice+0);
				System.out.println(Bob+0);

			}
		}

	}

}
