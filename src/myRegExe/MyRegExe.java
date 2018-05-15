package myRegExe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegExe {

	public static void main(String[] args) {
		String str1 = "My name is Shashank";
		String pattern = "Shashank";
		
		Pattern p =  Pattern.compile(pattern);
		Matcher m = p.matcher(str1);
		
		if(m.find())
		{
		
			System.out.println(" "+m.group(0));
		
		}
		else
		{
			System.out.println("not found");
		}

	}

}
