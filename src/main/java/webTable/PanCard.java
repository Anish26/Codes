package webTable;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PanCard {

	public static void main(String[] args, char[] replaceAll) {
		String text = "BSADP4999F";
		text.replaceAll("\\D", "");
		System.out.println(replaceAll);
		
		Pattern p = Pattern.compile(text);
		Matcher matcher = p.matcher(text);
		System.out.println(matcher);
		while (matcher.find()) {
			System.out.println(matcher.group());
			
		}

	}

}
