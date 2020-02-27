package Test;

import org.testng.annotations.Test;

public class ReverseString {

	
	@Test
	public void test()
	{
		// TODO Auto-generated method stub
		
		int n=121;
		int sum=0;
		int temp=n;
		int rem;
		while(n>0)
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.print("palindrome is " +sum);
		}
		


	}

}
