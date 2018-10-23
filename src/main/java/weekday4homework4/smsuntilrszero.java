package weekday4homework4;

public class smsuntilrszero {
	int currentBalance=9;
	public void sendsms(long MobNumber, String sms) {
		System.out.println(MobNumber+ "-"+sms);
		currentBalance = currentBalance-1;
	}
public void call(long MobileNumber) {
	System.out.println("Callconnect"+MobileNumber);
		currentBalance = currentBalance=-2;
		
	}
}