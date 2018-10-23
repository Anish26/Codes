package weekday4homework4;

public class senduntilbalzero {

	public static void main(String[] args) {
		smsuntilrszero send =new smsuntilrszero();
	 //for(int mobNumer=0;mobNumer<=10;mobNumer++) {
		{
			while(send.currentBalance !=0) {
			 send.sendsms(123456789, "hai");
			 send.call(1234);
			 if(send.currentBalance ==0) {
				 System.out.println("My current balance is zero"+send.currentBalance);
			 }
			 
			 
		 }
	 }
		 
		
	}

}
