import java.util.Scanner;
class Palindrome{
	static void palindrome_or_not(String str){
		String rev=str;
		int m=0;
		for(int i=0,j=(str.length()-1);i<str.length()-1;i++,j--){
			if(str.charAt(i)==rev.charAt(j))
				m++;
		}
		if(m==str.length()-1)
		System.out.println("It is a palindrome");
		else
		System.out.println("It is not a palindrome");
	}
	
	public static void main(String args[]){
		palindrome_or_not(args[0]);
	}
}
