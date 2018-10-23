package weekday8;

public class JavaPrograms {
	
	static JavaPrograms java = new JavaPrograms();
	static String text = "Focus on Interview";
	public static void main(String[] args) {
		    length();
			character();
			java.valueOfChar();
			java.search();
			java.searchFromRight();
			java.add();
			partial();
			begin();
			trim();
			lowercase();
			split();
			splitpar();
			replace();
		}
	
		//no of words in a string
		public static String length() {
			int count1 = text.length();
			System.out.println(count1);
			return text;
		}
		
		//no of char in a string
		public static String character() {
			char[] charArray = text.toCharArray();
			for(char c:charArray)
			System.out.println(c);
			return text;
		}
		
		//value of a string
		public void valueOfChar() {
			char charAt = text.charAt(4);
			System.out.println(charAt);		
		}

		//Search a char in a string
		public void search() {
			String text="Focus on Interview";
			int indexOf = text.indexOf("I");
			System.out.println(indexOf);
		}
		
		//search from right to left
		public void searchFromRight() {
			String text="Focus on Interview";
			int indexOf = text.lastIndexOf("e");
			System.out.println(indexOf);
		}		
			
		//concordinate
		public void add() {
			String text1 = "With Always Love";
			String text2  = "Balaji";
			String concat = text1.concat(" "+text2);
			System.out.println(concat);
		}
		
		//partial chars of a String
		public static void partial() {
			String substring = text.substring(4, 13);
			System.out.println(substring);
					
		}
		
		//partial chars
		public static void begin() {
			String substring = text.substring(3);
			System.out.println(substring);		
		}

		//remove white space
		public static void trim() {
			String text = " Focus on Interview ";
			String substring = text.trim();
			System.out.println(substring);		
		}
		
		//convert case
		public static void lowercase() {
			String substring = text.toLowerCase();
			System.out.println(substring);
			String upperCase = text.toUpperCase();
			System.out.println(upperCase);
		}
		
		//split char
		public static void split() {
			String[] split = text.split(" ");
			System.out.println(split.length);
			for(String eachWord : split)
			System.out.println(eachWord);
			}
		
		//split char
				public static void splitpar() {
					String[] split = text.split(" ");
					System.out.println(split.length);
					for(String eachWord : split)
						if (eachWord.startsWith("c")) {
					System.out.println(eachWord);
						}
						
				}
				
		//replace
		public static void replace() {
			String replace = text.replace("o", "u");	
			System.out.println(replace);
		}
		
}
 