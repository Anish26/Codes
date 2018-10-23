package weekday3;

public class mymobile {
	static mobile mobile = new mobile();
	

	public static void main(String[] args) {
		mymobile.openGallery();
		mymobile.openMyStorage(4);
		mobile.ringtone(1);
		mobile.selectapp(3);

	}

	//first method of class 2
	public static String openGallery() {
		String name = "photos";
		for (int openGallery = 1; openGallery<=10;openGallery++) {
			System.out.println("openGalley"+openGallery);
		}		
		return name;
		
	
	}
		//second method of class 2
	public static void openMyStorage (int folders) {
		String openMyStorage = "newFolder5";
		for (int folders1 = 10; folders1<10; folders1++ );{
			if(folders<=6) {
				System.out.println("folders"+folders);
			}else {
				System.out.println("folders8");
			}
				
				
				
			}
		
			
		}
	}
	

