package nseitAssighnment23Feb;

import java.util.function.*;

public class FindSpace {

	public static void main(String[] args)
	{
		
		String str = "NSE IT";
		Function<String,Integer> f= s1->s1.length()-s1.replace(" ","").length();
		System.out.println(f.apply(str));

	}

}
