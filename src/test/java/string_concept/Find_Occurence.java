package string_concept;

public class Find_Occurence {

	public static void main(String[] args) {
		String check = "I am a wonderful person";
		int occurenceofIamawonderfulperson = 0;
		char[] charArray = check.toCharArray();
		for (char c : charArray) {
			if(c=='a') {
				occurenceofIamawonderfulperson ++;
				
			}
			
		}
		
		System.out.println("Occurence of I am a wonderful person is :" +occurenceofIamawonderfulperson);
	}

}
