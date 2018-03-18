package observerpattern;

public class Customer implements Observer {

	private String customerName;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void update(String productName) {
		System.out.println("Hello "+customerName +" "+productName+" "+"is now available on amazon.");
	}

}
