package study.methodlocalinner;

public class Test3 {

	int alpha=888;
	
	public void m1()
	{
		final int x=100;
		int y=200;
		
		//Method Local inner class
		class LocalEx
		{
			int z=99;
			public void show()
			{
				System.out.println("z="+z+" x= "+x+" y= "+y+" alpha = "+alpha);
			}
			
		}//end of class
		
		LocalEx obj = new LocalEx();
		obj.show();
		LocalEx obj2 = new LocalEx();
		
	}//end of m1
	
	public static void main(String[] args) {

		Test3 t3 = new Test3();
		t3.m1();
		
	}

}
