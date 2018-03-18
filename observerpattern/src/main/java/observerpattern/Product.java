package observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject{

	private String productName;
	private List<Observer> listOfObservers=new ArrayList<Observer>();
	private boolean available;
	
	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
		if(isAvailable()==true) {
			notifyObservers();
		}
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void registerObserver(Observer observer) {
		listOfObservers.add(observer);
		}
	
	public void removeObserver(Observer observer) {	
		listOfObservers.remove(observer);
	}
	public void notifyObservers() {
	
	System.out.println("Notifying all the regestered observers when product becomes available");	
	for(Observer observer:listOfObservers) {
		observer.update(productName);
	}
	}

}
