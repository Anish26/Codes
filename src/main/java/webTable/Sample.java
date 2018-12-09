package webTable;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample {

	public static void main(String[] args) {
		String text = "TestLeaf(1234) as employee count 50";
		   String pattern = "\\d{2,4}";
		   Pattern p = Pattern.compile(pattern);
		   Matcher matcher = p.matcher(text);
		   System.out.println(matcher);
		   while(matcher.find()) {
		   System.out.println(matcher.group());
		   }
		   
		   /*String replaceAll = text.replaceAll("\\D", "");
		   System.out.println(replaceAll);*/
			}
		 

	}

	
