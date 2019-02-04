package week3;

public class PlaceOrder {
Command theCommand;
	public PlaceOrder(Command newCommand){
		theCommand = newCommand;
	}
	public boolean GiveTheOrderToBaker(){
		theCommand.execute();
		return true;
	}
	public void customerCancelTheOrder(){
		theCommand.undo();
	}
}
