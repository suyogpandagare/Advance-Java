package study.withoutinner;

public class User {

	private int data2 = 101;
	
	Test tobj = new Test();
	
	public void show()
	{
		System.out.println("data2 = "+data2+"data1= "+tobj.getData1());
	}
	
	public static void main(String[] args) {

		User obj = new User();
		obj.show();
	}

}//end of user class

class Test 
{
	private int data1 = 100;
	
	public int getData1()
	{
		return data1;
	}
}