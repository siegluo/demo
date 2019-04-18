package disruptor.generate1;

import java.util.concurrent.atomic.AtomicInteger;

public class Trade {  
	
	private String id;//ID  
	private String name;
	private double price;//金额  
	private AtomicInteger count = new AtomicInteger(0);
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public AtomicInteger getCount() {
		return count;
	}
	public void setCount(AtomicInteger count) {
		this.count = count;
	} 
	  
	  
}  