package org.system;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		String test="changeme";
		char[] ch = test.toCharArray();
		for( int i=0;i<test.length();i++) {
			if(i%2!=0)
			{
				ch[i]=Character.toUpperCase(ch[i]);
				
			}
		}
		String result=new String(ch);
		System.out.println(result);
	}
	

}
