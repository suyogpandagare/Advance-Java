package study;

public class VarArgsExample {

	public static void main(String[] args) {

		//how to call varargs diff ways
		//sum();
		//sum(10);
		//sum(10,20);
		//sum(10,20,30,40,50);   //=> any no of args can be passed
		
		holidays("june", 26,29,30);
		
	}//end of main

	static void sum(int... nums)
	{
		int total = 0;
		for(int i=0; i< nums.length; i++)
		{
			total = total + nums[i];
		}
		System.out.print("total= "+total);
	}
	
	static void holidays(String month, int...days) 
	{
		System.out.println("the holidays for "+month+" month are: -");
		for (int i : days) {
			System.out.print(i+" ");
		}
	}
	
	
}//end of VarArgsExample
