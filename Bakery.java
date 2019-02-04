package week3;
public class Bakery{
	
	public static void main(String[] args){
		ClientOrder NewOrder = Baker.GetOrder();
		ChoclateCake chocklateCakeOrder = new ChoclateCake(NewOrder);
		PlaceOrder Place = new PlaceOrder(chocklateCakeOrder);
		Place.GiveTheOrderToBaker();
		
		
		CheeseCake cheeseCakeOrder = new CheeseCake(NewOrder);
		Place = new PlaceOrder(cheeseCakeOrder);
		Place.GiveTheOrderToBaker();
	
		SimpleCake simpleCakeOrder = new SimpleCake(NewOrder);		
		Place = new PlaceOrder(simpleCakeOrder);
		Place.GiveTheOrderToBaker();
	}
}