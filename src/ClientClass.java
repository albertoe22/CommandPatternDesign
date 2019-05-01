import java.util.Scanner;

public class ClientClass {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		System.out.println("What stock would you like to buy? What is it's Price?");
		String phrase = in.nextLine();
		String delims = "[ ,]+";
		String[] tokens = phrase.split(delims);
		Stock stock = new Stock(tokens[0], Double.parseDouble(tokens[1]));
		System.out.println("How many would you like to buy?");
		int quantity = in.nextInt();
		BuyStock buyStockOrder = new BuyStock(stock, quantity);
		SellStock sellStockOrder = new SellStock(stock, quantity);
		
		
	
	}

}
