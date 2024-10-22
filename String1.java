import java.util.*;
public class String1
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
		
		System.out.println(str.equals(str1));
		System.out.println(str.equals(str2));
		System.out.println(str.equals(str3));
		System.out.println(str3.equals(str4));
		System.out.println(str4.equals(str5));
		
		
		}
}