package study.usinginner;

//outer class
public class Test {

	private int data1=100;
	private int common=200; //this is the property of Test
	
	public void display()
	{
		//outer class explicitly creates object of User
		System.out.println("data1= "+data1+" data2= "+new User().data2);
	}
	
	
	//inner class
	class User
	{
		private int data2=101;
		private int common = 344; //this is property of User
		
		public void show()
		{
			System.out.println("using inner class data2 = "+data2+" data1 = "+data1);
			System.out.println("Common of outer ="+Test.this.common+" Common of inner = "+this.common);  //when we have same fields name we have to tell that this is inner class fiels or outer class field
		}
	}//end of user class
	
	public static void main(String[] args) {

		Test obj = new Test();
		User u = obj.new User();
		u.show();
		
	}//end of main

}//end of test
