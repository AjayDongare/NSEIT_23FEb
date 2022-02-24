package nseitAssighnment23Feb;

import java.util.function.*;

public class RemoveSpace
{

	public static void main(String[] args) 
	{
		String str ="NSE IT";
		Function <String,String> f=s1->{
		
		s1=str.replaceAll(" ","");
		return s1;
		};
		System.out.println(f.apply(str));
	}
}