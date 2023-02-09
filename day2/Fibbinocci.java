package week1.day2;

public class Fibbinocci {
	public static void main(String[] args) {
		int firstNum=0;
		int secNumber=1;
		int sum = 0;
		System.out.println(firstNum);
		 for(int i= 1;i<=11;i=i+1)	
		{
			 sum=firstNum+secNumber;
			 firstNum=secNumber;
			 secNumber=sum;
			 System.out.println(sum);	 
			 
			
		} 
	
	}
	


}
