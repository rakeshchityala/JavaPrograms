package com.jigsawlearning;

class Access {
	public int x;
	private int y;
	
	void cal(int a, int b) {
		x=a+1;y=b;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access obj= new Access();
		obj.cal(2, 3);
		System.out.println(obj.x+ " " +obj.y);
		

	}

}

