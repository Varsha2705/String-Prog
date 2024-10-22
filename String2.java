import java.util.*;
public class String2
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String str = "abc";
		String str1 = "abc";
		String str2 = "xyz";
		String str3 = new String("abc");
	    String str4 = new String("abc");
		String str5 = new String("xyz");
		
		System.out.println(str == str1);
		System.out.println(str == str2);
		System.out.println(str == str3);
		System.out.println(str3 == str4);
		System.out.println(str4 == str5);
		System.out.println(str.concat("xyz"));
		System.out.println(str.length(str2));
		
		
		
		}
}