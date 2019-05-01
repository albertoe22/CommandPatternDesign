
public class BuyStock implements Order{
	private Stock stock;
	private int x;
	
	public BuyStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.buy(x);
		
	}
	

}
