package week1.day2;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int count=0;
		
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==0)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
		
		
	}

}
