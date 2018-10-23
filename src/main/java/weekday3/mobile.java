package weekday3;

public class mobile {
	
	

	public static void main(String[] args) {
		mobile mobile = new mobile();
		mobile.dial(0);
		mobile.textreceived();
		mobile.ringtone(2);
		mobile.selectapp(2);
					

	}
	//first method dialing
	public void dial(int dial) {
	    dial = 123;
		System.out.println(dial);
	}

	//second method using string
	public static String textreceived() {
		String message ="incomingMessage";
		System.out.println("incomingMessage");
		return message;
			
	}
	// third method ringtone
	public static void ringtone(int mobileNetwork) {
		if (mobileNetwork == 1 ){
		  System.out.println("ringtone1");
	    }else {
			System.out.println("ringtone2");}
		}
		
	//fourth method function
		public static String selectapp(int value) {
		String select = "";
		switch(value) {
		case 1 : select ="camera";break;
		case 2 : select ="inbox";break;
		case 3 : select ="whatsapp";break;
		}
		System.out.println(select);
		return select;
	}		 	
		}
		
				
	
			
	
