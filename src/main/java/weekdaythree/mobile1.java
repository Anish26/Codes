package weekdaythree;

import weekday3.mobile;
import weekday3.mymobile;

public class mobile1 {

	
	public static void main(String[] args) {
		mobile1 mobile1 = new mobile1();
		mobile1.openChatbox("mom");
		mymobile.openGallery();
		mobile.textreceived();
		mobile.selectapp(3);
		
	
	}		

		

	//first method of class 1 of package 2
	public static String openChatbox(String Whom) {
		String Select = "Text";
		switch (Whom) {
		case "dad" : Select ="Message from dad";break;
		case "mom" : Select ="Message from mom";break;
		case "cousin" : Select ="Message from cousin";break;
		case "friendone" : Select ="Message form friend1";break;
		case "friendtwo" : Select ="Message from friend2";break;
		}
		System.out.println(Select);
		return Select;
	}
}

		
	


	