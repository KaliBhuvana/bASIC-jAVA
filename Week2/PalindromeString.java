package Week2;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="madamm";

String temp="";
	
	for(int i=s1.length()-1;i>=0;i--) {
		temp=temp+s1.charAt(i);
	}
	
	if(s1.equals(temp))
		
		System.out.println("It is a Palindrome");
	
	else
		System.out.println("Non Palindrome");
	}

}
