package webTable;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegex {

	public static void main(String[] args) {
		String text = "9800 7800 5460";
		String pattern = "\\d{4}\\s{1},\\d{4}\\s{1},\\d{4}";
		Pattern p = Pattern.compile(pattern);
		Matcher matcher = p.matcher(text);
		System.out.println(matcher);
		while (matcher.find()) {
			System.out.println(matcher.group());
			
			
		}
		
		
		

	}

}
