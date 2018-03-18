package observerpattern;

public class ObserverPatternTest {

	public static void main(String[] args) {
		Customer customer1=new Customer();
		customer1.setCustomerName("Srinadh Reddy");
		Customer customer2=new Customer();
		customer2.setCustomerName("Chaitanya");
		
		Product iphoneX=new Product();
		iphoneX.setProductName("Apple Product");
		iphoneX.setAvailable(false);
		
		iphoneX.registerObserver(customer1);
		iphoneX.registerObserver(customer2);
		
		iphoneX.setAvailable(true);
		iphoneX.removeObserver(customer2);
		iphoneX.setAvailable(true);
	}

}
