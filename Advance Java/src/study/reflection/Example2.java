package study.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter class name: ");
		Class c1 = Class.forName(sc.next());
		
		System.out.println("The class is  "+c1.getName());
		//Object obj = c1.newInstance();
		
		Constructor ctor = c1.getDeclaredConstructor(null);
		Object obj = ctor.newInstance();
		
		Constructor ctor2 = c1.getDeclaredConstructor(String.class, int.class);
		Object obj2 = ctor2.newInstance("new year celebration",30);
		
		
		Field[] properties = c1.getDeclaredFields();
		
		for (Field field : properties) {
			field.setAccessible(true);
			System.out.println(" obj = " + field.getName()+ " : "+ field.get(obj));
			System.out.println(" obj2 = "+ field.getName()+ " : "+ field.get(obj2));
		}
		
		System.out.println("Enter Method name to call");
		String mname = sc.next();
		Method method = c1.getDeclaredMethod(mname);		
		
		method.invoke(obj);
		method.invoke(obj2);
	}

}//end of Example2

class SocialEvent
{
	private String eventName;
	private int numberOfPeople;
	
	public SocialEvent()
	{
		eventName = "birthday party";
		numberOfPeople = 10;
	}
	
	public SocialEvent(String en, int num)
	{
		eventName = en;
		numberOfPeople = num;
	}
	
	public void show()
	{
		System.out.println("show method called "+eventName+ " "+numberOfPeople);
		
	}
	
	public int getNumberOfPeople()
	{
		return numberOfPeople;
	}
	
	
}