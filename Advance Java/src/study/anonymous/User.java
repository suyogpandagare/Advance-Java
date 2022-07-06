package study.anonymous;

public class User {

	public static void main(String[] args) {

		//I1 obj = new I1();   //cannot instiantiate as I1 isinterface
		I1 obj = new I1() { //this is anonymous class I1
			
			@Override
			public String doTask2() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void doTask1() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void doTask3(int x) {
				// TODO Auto-generated method stub
				System.out.println(x);
			}
		};
		
		obj.doTask1();
		System.out.println(obj.doTask2());
		obj.doTask3(22);
	}

}//end of User class

interface I1
{
	void doTask1();
	String doTask2();
	void doTask3(int x);
}
