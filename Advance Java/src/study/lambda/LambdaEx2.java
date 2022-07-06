package study.lambda;

import java.util.Comparator;
import java.util.TreeSet;

public class LambdaEx2 {

	public static void main(String[] args) {

		Comparator<Student> cmp = (o1,o2)->{
			if(o1.roll > o2.roll) return 1;
			if(o1.roll < o2.roll) return -1;
			else
				return 0;
		};
		
		
		TreeSet<Student> ts = new TreeSet<Student>(cmp);
		ts.add(new Student(12, "suyog"));
		ts.add(new Student(56,"zree"));
		ts.add(new Student(1,"mree"));
		ts.add(new Student(33,"pree"));
		ts.add(new Student(5,"hhree"));
		
		for (Student student : ts) {
			System.out.println(student);
		}
		
	}

}//end of LambdaEx2

class Student implements Comparable<Student>
{
	int roll;
	String name;
	
	Student(int r, String n)
	{
		roll = r;
		name = n;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " ,"+ this.roll;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
}