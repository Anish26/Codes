package weekday4homework2;


public class printpriceofcostliestandcheapestmobile {

	public static void main(String[] args) {
		printpriceofcostliestandcheapestmobile  mobileprice = new printpriceofcostliestandcheapestmobile ();
		mobileprice.findmobileprice(500000);
		
	}

	//find the costliest and cheapest mobile
	public void findmobileprice(int mobilePrice) { 
		if (mobilePrice  >= 45000){
			System.out.println("Costliestmobile");
		}else {
			System.out.println("Cheapestmobile");
			}
		
			
		}
	}

