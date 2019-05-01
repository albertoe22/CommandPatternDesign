import java.util.ArrayList;
import java.util.List;
public class Broker {
	private List<Order> orderList = new ArrayList<Order>();
	
	public void placeOrders() {
		for (Order order: orderList) {
			order.execute();
		}
		orderList.clear();
	}
	

}
