package nseitAssighnment23Feb;

import java.util.function.Predicate;

public class FunctionPredicate {

	public static void main(String[] args)
	{
		Predicate<Integer> p1= n->n%2==0;
		System.out.println("Even: "+ p1.test(10));
		System.out.println("Even: "+p1.test(9));
		System.out.println(p1.test(6));
		
		Predicate<Integer> p2= n->n>100;
		System.out.println("Greater than 100 : "+p2.test(12));
		
		Predicate<Integer> p3 = n->
		{
			boolean isPrime=true;
			for(int i=2;i<n-1;i++)
			{
				if(n%i==0)
				{
					isPrime=false;
					break;
				}
			}
			return isPrime;
		};
		System.out.println("Prime: "+p3.test(7));
		
		System.out.println("> 100 and even: "+p1.and(p2).test(24));
		System.out.println("> 100 and even: "+p1.or(p2).test(24));
		System.out.println("Odd Number: "+p1.negate().test(10));
	}

}

