import java.util.Scanner;

public class ClientClass {
	public static void main(String[] arg) {
		while (true) {
			Scanner in = new Scanner(System.in);
			System.out.println("What stock would you like to buy? What is it's Price? / quit");
			String phrase = in.nextLine();
//			if (phrase.equalsIgnoreCase("quit")) {
//				break;
//			}
//			else {
			
			String delims = "[ ]+";
			String[] tokens = phrase.split(delims);
			System.out.println(tokens.length);
			Stock stock = new Stock(tokens[0], Double.parseDouble(tokens[1]));
			//Stock stock = new Stock("ASB", 1);
			System.out.println("How many would you like to buy?");
			int quantity = in.nextInt();
			BuyStock buyStockOrder = new BuyStock(stock, quantity);
			SellStock sellStockOrder = new SellStock(stock, quantity);

			Broker broker = new Broker();
			broker.takeOrder(buyStockOrder);
			broker.takeOrder(sellStockOrder);
			broker.placeOrders();
			//}
			
		}
	
	}

}
