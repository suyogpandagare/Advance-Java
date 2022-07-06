package study.mvc;

import java.util.ArrayList;

public class TableGen {

	public static ArrayList<String> getTable(int n)
	{
		ArrayList<String> al = new ArrayList<String>();
		for(int i=1;i<=10;i++)
		{
			String s = n+"*"+i+"="+(n*i);
			al.add(s);
		}
		return al;
	}
}
