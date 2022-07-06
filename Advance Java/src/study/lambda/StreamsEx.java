package study.lambda;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamsEx {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("red");
		al.add("blue");
		al.add("violet");
		al.add("pink");
		al.add("green");
		al.add("black");
		al.add("orange");
		
		
		al.stream().forEach((element)->{System.out.println("this is  "+element);});
		
		al.stream().forEach( (e)->{System.out.println(e.toUpperCase());});
		
		System.out.println("AFTER FILTERING");
		//select only those elements that match a condition and create a new stream
		Stream<String> filteredStream = al.stream().filter( (ele)->{ if(ele.length() < 5) return true; else return false;} );
		filteredStream.forEach( (e)->{System.out.println(e);});
		
		//this is shorthand than previous
		al.stream()
		.filter( (ele)->{ if(ele.length() < 5) return true; else return false;} )
		.forEach( (e)->{System.out.println(e);});
		
		System.out.println("Another Filter...");
		al.stream().filter( (ele)->{if(ele.length() > 5) return true; else return false;})
		.forEach((e)->{System.out.println("--"+e);});
		
		al.forEach((e)->{if(e.length() > 5) System.out.println(e); else System.out.println("no colour");});
		
		for (String string : al) {
			
		}
	}//end of main
	
	

}
