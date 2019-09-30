import java.text.AttributedString;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello Eclipse");
		Scanner sc= new Scanner(System.in);
		//Arrays.sort(args);
		String str="Sample String in Java";
		int x=0;

		System.out.println(str.toLowerCase());
		System.out.println(str);

		System.out.println(str.length());

		System.out.println(str.substring(0, 6));

		System.out.println(str.indexOf("Java"));

		System.out.println(str.contains("Python"));

		//String [] strarray= new String[5];

		String [] strarray= {"one", "two", "three", "four", "five" };

		for(String tempstr : strarray)
		{
			System.out.println(tempstr);
		}

		Arrays.sort(strarray);
		System.out.println("After sort");
		for(String tempstr : strarray)
		{
			System.out.println(tempstr);
		}

		String	strrOrder="aba";
		String strReverse="";

		for(int i=strrOrder.length()-1;i>=0;i--) {
			strReverse=strReverse+strrOrder.charAt(i);
		}

		System.out.println("Reversed string is: "+ strReverse);
		
		if(strrOrder.equals(strReverse)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
		String[] tempArray= str.split(" ");
		
		System.out.println(tempArray.length);
	
		for(String tempstr : tempArray)
		{
			System.out.println(tempstr);
		}
		
		
	}

}
