package assign1;

public class RetailShop {

	public static void main(String[] args) 
	{
		
         int penNo=6,pencilNo=2,bookNo=1;
         int penPrice=10,pencilPrice=5,bookPrice=50;
         
         int penTot=penNo*penPrice;
         int pencilTot= pencilNo*pencilPrice;
         int bookTot= bookNo*bookPrice;
         
         double totalPrice=penTot+pencilTot+bookTot;
         double discPrice=totalPrice-0.1*totalPrice;
         double amountToPay= discPrice+0.05*discPrice;
         System.out.println("Total amount to pay is "+amountToPay);
         
         
         
         
         
        
         
	}

}

